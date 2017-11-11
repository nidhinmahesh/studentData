import java.io.*;
import java.util.*;

public class SeeDetails{

    public void getDetails()
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        String name = sc.next();
        try{

            File file = new File("students.txt");
            Scanner scan = new Scanner(file);

             while(scan.hasNextLine()){
                final String lineFromFile = scan.nextLine();
                 if(lineFromFile.contains(name)){



                    System.out.println("I found " +name+ " in file " +file.getName());


                    
                 }
              }
            
        }

        catch(Exception e)
        {
            System.out.println("Cannot find: "+e);
        }
    }
}