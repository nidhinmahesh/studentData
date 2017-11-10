import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;


public class EditStudentCriteria{

    public void editCriteria(){

        try{
            ArrayList arr = new ArrayList();
            
                    BufferedReader reader = new BufferedReader(new FileReader("bio.txt"));
                    String queries;
                    while((queries = reader.readLine())!= null)
                    {
                        arr.add(queries);
                    }
            
            
                    System.out.println("Enter number of criterias: "+'\n' +"Enter one by one.");
                    Scanner scan = new Scanner(System.in);
                    int criteria = scan.nextInt();
            
                    while(criteria != 0)
                    {
                        String myCriteria = scan.nextLine();    
                        arr.add(myCriteria);
            
                    }
                    reader.close();
                    scan.close();
        }

        catch(Exception e)
        {
            System.out.println("Cannot edit criteria: "+e);
        }
    }
}