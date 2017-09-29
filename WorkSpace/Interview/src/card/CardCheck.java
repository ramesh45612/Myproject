/*
 * *This is developed by Venkat
 * */

package card;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardCheck {

	private Map<String, String> finalOutPut = new HashMap<String, String>();

	/**
	 * CVS file related Instance variables.
	 */
	
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static final String NEW_FILE_NAME = "cardInfo.csv";
	
	/**
	 * Card details instance variables
	 */
	private String recordDetailsline = null;
	private String recordDetails = null;
	private static int failureCount = 0;
	private static boolean cardFlag = true;
	private static boolean cardStatus = true;
	private static CardCheck  cardCheck   = new CardCheck();
	
	/**
	 * Card details validated starts here.
	 * @param args
	 */
	public static void main(String[] args) {

		while (true) {
			Scanner inputCardNumebr = new Scanner(System.in);
			
			if (!cardStatus) {
				failureCount = failureCount + 1;
			} 

			if (failureCount < 3) {
				cardStatus = getInputFromUser(inputCardNumebr);

			} else {
				System.err.println(
						"!!! Sorry we are not processing your request currently  because of you are exceeds the 3 attempts and you should try after 30 seconds.");

				try {
					Thread.sleep(30000);
					failureCount =0;
					cardStatus = true;
				} catch (InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
			}

			System.out.println("Do you want to exist the system then type 'Yes/Y'  else type anykey to Continue ??? ");

			Scanner exitvalueScanner = new Scanner(System.in);
			String exitValue = exitvalueScanner.next();

			if (exitValue.equalsIgnoreCase("Yes") || exitValue.equalsIgnoreCase("Y")) {
				System.out.println("You successfully Logout from the system.");
				System.exit(0);
			} else {
				try {
					Thread.sleep(300);
				} catch (InterruptedException ex) {
					
				}
				continue;
			}

		}

	}


	/**
	 * 
	 * @param inputCardNumebr
	 * @return
	 */
	private static boolean getInputFromUser(Scanner inputCardNumebr) {
		System.out.print("Enter card number: ");
		
		long cradNumber = 0;
		try {
			cradNumber = inputCardNumebr.nextLong();
			
			String cardNumberCheck = String.valueOf(cradNumber);
			
			
			
			if(cardNumberCheck.length()>=13 && cardNumberCheck.length() <=16){
				
				boolean csvflag = getCardetailsFromCSVFile(String.valueOf(cradNumber));
				
				if(!csvflag) {
							/**
							 * get the brand name 
							 */
							boolean cardbrandflag = cardCheck.getCardBrandName(String.valueOf(cradNumber));
							/**
							 * get the card validated or not 
							 */
							boolean cardvalidatedFlag = luhnCardCheck(String.valueOf(cradNumber));
							if(cardvalidatedFlag){
								cardCheck.finalOutPut.put("validate", "Valid");
							}else{
								cardCheck.finalOutPut.put("validate", "Not Valid");
							}
							/**
							 * finding the user account number 
							 */
							char[] useraccountNumber = 	String.valueOf(cradNumber).toCharArray();
						
							String userAccountNumber = "";
						
							for (int i = 6; i < useraccountNumber.length-1; i++) {
									userAccountNumber  =userAccountNumber +useraccountNumber[i];
							}
							cardCheck.finalOutPut.put("userAccountNumber", userAccountNumber);
						
							boolean miiflag  = cardCheck.getMajorIndustryIdentifier(useraccountNumber[0]);
						
						
							if(cardvalidatedFlag && cardbrandflag){
							    
							boolean fileexistflag = getFileInfo(NEW_FILE_NAME);	
							
							// check if file exist or not 
						    if(fileexistflag){
							   boolean recordupdateFlag = cardCheck.updateCardNumberDetails(String.valueOf(cradNumber));
								 
						    }else{
							   boolean cardcvsresultFlag = cardCheck.writeCarddetailsIntoCvsFile(String.valueOf(cradNumber));
								 
						    }
							
							
						}
						// sending successmessage
						if(cardvalidatedFlag && cardbrandflag)
							cardFlag =cardvalidatedFlag;
						else
							cardFlag =false;
						
				} else {
					cardFlag = true;
				}
				if(cardFlag) {
					System.out.println();
					System.out.println("The System found the following Information :");
					System.out.println();
				    System.out.println("Industry : "+cardCheck.finalOutPut.get("Industry"));
				    System.out.println("Issuer/brand : "+cardCheck.finalOutPut.get("Issuer/brand"));
				    System.out.println("userAccountNumber : "+cardCheck.finalOutPut.get("userAccountNumber"));
				    System.out.println("validate : "+cardCheck.finalOutPut.get("validate"));
				    System.out.println();
				}else{
					System.out.println();
					System.out.println("Your card details not valid.");
					System.out.println();
				}
			}else {
				System.out.println("Max number of digits should be 16, and min should be 13 ");
				cardFlag = false;
			}
			
		
		} catch (Exception e) {
			
			System.out.println("You are not entering integer value , please try again with integer values.");
			cardFlag = false;
		}
		return cardFlag;
	}

	/**
	 * @return void
	 */
	private void updateMapDetails() {
		
			if(recordDetails!=null){
				
				// split the line in to string array
				String[] recordDetailsArray  = recordDetails.split(",");
				
				finalOutPut.put("Industry",recordDetailsArray[1]);
				finalOutPut.put("Issuer/brand",recordDetailsArray[2]);
				finalOutPut.put("userAccountNumber", recordDetailsArray[3]);
				finalOutPut.put("validate",recordDetailsArray[4]);
				System.out.println();
			}
			
	   }

	/**
	 * 
	 * @param cardNumber
	 * @return boolean
	 */
	private boolean updateCardNumberDetails(String cardNumber) {
			List<String> lines = new ArrayList<String>();
			String line = null;

			try {
		        File cardFileObj = new File(NEW_FILE_NAME);
		        FileReader fr = new FileReader(cardFileObj);
		        BufferedReader br = new BufferedReader(fr);
		        while ((line = br.readLine()) != null) {
		               lines.add(line);
		               lines.add(NEW_LINE_SEPARATOR);
		        }
		        
		        // new values are inserted into file
		        
		        StringBuilder   stingBuilder = new StringBuilder();
		        stingBuilder.append(cardNumber);
		        stingBuilder.append(COMMA_DELIMITER);
		        stingBuilder.append(finalOutPut.get("Industry"));
		        stingBuilder.append(COMMA_DELIMITER);
		        stingBuilder.append(finalOutPut.get("Issuer/brand"));
		        stingBuilder.append(COMMA_DELIMITER);
		        stingBuilder.append(finalOutPut.get("userAccountNumber"));
		        stingBuilder.append(COMMA_DELIMITER);
		        stingBuilder.append(finalOutPut.get("validate"));
		        stingBuilder.append(NEW_LINE_SEPARATOR);
		        lines.add(stingBuilder.toString());
		        
		        fr.close();
		        br.close();

		        
		        FileWriter fileWriterObj = new FileWriter(cardFileObj);
		        BufferedWriter out = new BufferedWriter(fileWriterObj);
		        for(String s : lines){
		             out.write(s);
		        }
		        out.flush();
		        out.close();
			}catch (Exception ex) {
		        ex.printStackTrace();
		    }
		return false;
	}

	/**
	 * 
	 * @param cardNumber
	 * @return boolean
	 */
	private  boolean getCardNumberDetails(String cardNumber) {
		// TODO Auto-generated method stub
			boolean recordfound = false;
			
			try {
				File f1 = new File(NEW_FILE_NAME);
				FileReader fr = new FileReader(f1);
				BufferedReader br = new BufferedReader(fr);
				while ((recordDetailsline = br.readLine()) != null) {
					if (recordDetailsline.contains(cardNumber)) {
						recordfound = true;
						recordDetails = recordDetailsline;
					}

				}
				fr.close();
				br.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		return recordfound;
	 }

	/**
	 * 	
	 * @param newFileName
	 * @return existFlag
	 */
	private static boolean getFileInfo(String newFileName) {
			boolean existFlag  = false;
			File f = new File(newFileName);
			if(f.exists() && !f.isDirectory()) { 
			    
				existFlag = true;
			}
		return existFlag;
		}

   /**
    * 
    * @param CardNumber
    * @return writeflag
    */
	private  boolean writeCarddetailsIntoCvsFile(String CardNumber) {
			FileWriter fileWriter = null;
			boolean writeflag = true;
			try {
					 fileWriter = new FileWriter(NEW_FILE_NAME);
		          	 fileWriter.append(CardNumber);
	                 fileWriter.append(COMMA_DELIMITER);
					 fileWriter.append(finalOutPut.get("Industry"));
					 fileWriter.append(COMMA_DELIMITER);
					 fileWriter.append(finalOutPut.get("Issuer/brand"));
					 fileWriter.append(COMMA_DELIMITER);
					 fileWriter.append(finalOutPut.get("userAccountNumber"));
					 fileWriter.append(COMMA_DELIMITER);
					 fileWriter.append(finalOutPut.get("validate"));
					 fileWriter.append(NEW_LINE_SEPARATOR);

		             System.out.println("CSV file was created successfully !!!");
				} catch (Exception e) {
					writeflag = false;
		      } finally {
		    	  try {

		              fileWriter.flush();

		              fileWriter.close();

		          } catch (IOException e) {
		          }

		}
		return writeflag;
	}

	/**
	 * 
	 * @param cradNumber
	 * @return successflag
	 */
	private static boolean getCardetailsFromCSVFile(String cradNumber) {
			
			boolean fileexistflag = getFileInfo(NEW_FILE_NAME);	
			boolean successflag =false;
			
			// check if file exist or not 
		   if(!fileexistflag){
			   successflag = false;
			}else{
				boolean recordfoundFlag = cardCheck.getCardNumberDetails(String.valueOf(cradNumber));
				
				if(recordfoundFlag){
					cardCheck.updateMapDetails();
					successflag = true;
				}else{
					successflag = false;
					}
			}
		   
		return successflag;
	}

	/**
	 * 	
	 * @param cardFirstNumber
	 * @return miiflag
	 */
	private  boolean getMajorIndustryIdentifier(char cardFirstNumber) {
			boolean miiflag  = false;
			
			int firstNum = Character.getNumericValue(cardFirstNumber);
			if(firstNum==1 || firstNum == 2){
				finalOutPut.put("Industry", "Airlines");
			}
			if(firstNum==3){
				finalOutPut.put("Industry", "Travel");	
					}
			if(firstNum==4 || firstNum == 5){
				finalOutPut.put("Industry", "Banking and Financial");
			}
			if(firstNum==6){
				finalOutPut.put("Industry", "Merchandising and Banking/Financial");
			}
			if(firstNum==7){
				finalOutPut.put("Industry", "Petroleum");
			}
			if(firstNum==8){
				finalOutPut.put("Industry", "Healthcare, Telecommunications");
			}
			if(firstNum==9){
				finalOutPut.put("Industry", "National Assignment");
			}
			
			return miiflag;
		}

		public boolean getCardBrandName(String card) {
			boolean brandflag  = false;
			String regex = "^(?:(?<visa>4[0-9]{12}(?:[0-9]{3})?)|" + "(?<mastercard>5[1-5][0-9]{14})|"
					+ "(?<discover>6(?:011|5[0-9]{2})[0-9]{12})|" + "(?<amex>3[47][0-9]{13})|"
					+ "(?<diners>3(?:0[0-5]|[68][0-9])?[0-9]{11}))$";
	
			Pattern pattern = Pattern.compile(regex);
	
			// Match the card
			Matcher matcher = pattern.matcher(card);
	
			if (matcher.matches()) {
				// If card is valid then verify which group it belong
				if (matcher.group("visa") != null) {
					finalOutPut.put("Issuer/brand", "visa Card");
				}
	
				if (matcher.group("mastercard") != null) {
					finalOutPut.put("Issuer/brand", "master Card");
				}
	
				if (matcher.group("discover") != null) {
					finalOutPut.put("Issuer/brand", "discover Card");
				}
	
				if (matcher.group("amex") != null) {
					finalOutPut.put("Issuer/brand", "amex Card");
				}
				if (matcher.group("diners") != null) {
					finalOutPut.put("Issuer/brand", "diners Card");
				}
				brandflag = true;
			}
			return brandflag;
		}
	
		/**
		 * 
		 * @param cardnumber
		 * @return luhnCardCheckflag
		 */
		public static boolean luhnCardCheck(String cardnumber)
	    {
	        int sum = 0;
	        boolean luhnCardCheckflag = false;
	        for (int i = cardnumber.length() - 1; i >= 0; i--)
	        {
	            int nthPostion = Integer.parseInt(cardnumber.substring(i, i + 1));
	            if (luhnCardCheckflag)
	            {
	            	nthPostion *= 2;
	                if (nthPostion > 9)
	                {
	                	nthPostion = (nthPostion % 10) + 1;
	                }
	            }
	            sum += nthPostion;
	            luhnCardCheckflag = !luhnCardCheckflag;
	        }
	        return (sum % 10 == 0);
	    }
}
