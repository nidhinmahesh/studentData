import java.io.*;
import java.util.Scanner;

public class Entry{
    Status stEnt = new Status();
    Scanner s = new Scanner(System.in);
    // public Entry(){

    // }
    public int lines(){
    try {
        int line = 0;
        BufferedReader reader = new BufferedReader(new FileReader("features.txt"));
        while((reader.readLine()) != null){
            line++;
        }
        reader.close();
        return line;
        
        } 
        catch (Exception e) {
            System.out.println("Oops! Cannot fetch features..");
            return 0;
        }
    }
    public void readData(int ln){
        System.out.println(ln+" queries needed");
        
        try{
            System.out.print("Enter student roll number: ");
            String ROLL_NUMBER = s.next();
            String name = ROLL_NUMBER + ".txt";
            FileWriter out = null;
            out = new FileWriter(name);
            for(int num = 1; num<=ln; num++){

            }
            out.close();
        }
        catch(Exception e){
            System.out.println("cannot read data!");
        }
        
    }

   
}