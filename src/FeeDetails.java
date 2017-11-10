import java.util.*;
import java.io.*;

public class FeeDetails{

    Scanner scan = new Scanner(System.in);

    int i=0;
    int k=0;
    String[] get = new String[100];


    public void ask()
    {
        get[i] = scan.next();
        i++;
    }


    public void enterFeeDetails()
    {
        System.out.println("semester: ");
        ask();
        System.out.println("Schedule: ");
        ask();
        
        try{

            FileWriter fw = new FileWriter("schedule.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);
            
                out.print("\n");
                while(i>=0)
                {
                    out.print(get[k]+"\t");
                    
                    k++;
                    i--;
                }
                
                out.close();
                
                System.out.println("done.|/");
            }
            catch(Exception e)
            {
                System.out.println("Cannot add student marks: "+e);
            }
    }



    public void getFeeDetails()
    {

    }
}