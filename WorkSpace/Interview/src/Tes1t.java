import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

 class lotteryData
 {
     int ticketsSold;
     ArrayList name = new ArrayList();
     ArrayList lottoNum = new ArrayList();
 }


class lottery {
static String dataFileName;
static String lotteryNum;
static lotteryData ticket = new lotteryData();

public lottery(String fileName)
{
    dataFileName = fileName; 
}

public void populateData()
{
      try
    {
       boolean firstLine = true;
        // loop the data into the data structure
        Scanner s1 = new Scanner(new File(dataFileName));
        // Loop to know how many people we have in the file
        while(s1.hasNext())
        {
            if(firstLine = true)
            {

                int numTickets = ticket.ticketsSold;
                firstLine = false;
            }
            else{
        // ticketSold times 2 because thats twice as many lines and we get 2 at a time
        for (int i =0; i<(ticket.ticketsSold * 2); i++)
        {
            // Loop to put in data
            for(int j = 0; j<2; j++)
            {

                ticket.name.get(j);
                ticket.lottoNum.get(j+1);


            }
        }
        }

        s1.close();
    }
    }

       catch(Exception ex)
    {
        System.out.println(ex.toString());
        ex.printStackTrace();
    }
}
}