package Core;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class SendEmail  

{
 public static void main(String[] args) throws Exception {
	 Properties props = new Properties();
	 props.put("mail.smtp.host", "smtp.gmail.com");  
	  props.put("mail.smtp.socketFactory.port", "465");  
	  props.put("mail.smtp.socketFactory.class",  
	            "javax.net.ssl.SSLSocketFactory");  
	  props.put("mail.smtp.auth", "true");  
	  props.put("mail.smtp.port", "587");  
	  
	  Session s = Session.getDefaultInstance(props,  
			   new javax.mail.Authenticator() {  
			   protected PasswordAuthentication getPasswordAuthentication() {  
			   return new PasswordAuthentication("sankojikrish@gmail.com","mygmail7");//change accordingly  
			   }  
			  }); 
	  
	 Message msg=new MimeMessage(s);
	 msg.setSubject("Subject");
	 msg.setText("mail body");
	 msg.setFrom(new InternetAddress("sankojikrish@gmail.com"));
	 msg.addRecipient(Message.RecipientType.TO,new InternetAddress("ramesh45612@gmail.com"));  
	    
	   //send message  
	   Transport.send(msg);  
	  
	   System.out.println("message sent successfully");  
	   
	 
 }
 }
 