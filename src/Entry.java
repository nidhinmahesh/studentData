import java.io.*;
import java.util.Scanner;

public class Entry{
    Status stEnt = new Status();
    Scanner s = new Scanner(System.in);
    //fetch common details like roll number
    Fetch fet = new Fetch();
    public int lines(){
        try {
            int line = 0;
            
            BufferedReader reader = new BufferedReader(new FileReader("features.txt"));
            while((reader.readLine()) != null){
                line++;
            }
            //writes features into array
            int i=0;
            String[] feats = new String[line];
            while((reader.readLine()) != null){
                // feats[i] = org.apache.commons.io.IOUtils.toString(reader);
                //feats[i] = (String)reader;
                i++;
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
            //create student file name
            // System.out.print("Enter student roll number: ");
            // String ROLL_NUMBER = s.next();
            String ROLL_NUMBER = fet.roll();
            String name = "T"+ROLL_NUMBER + ".txt";
            FileWriter out = null;
            out = new FileWriter(name);
            //write file student details
            for(int num = 0; num<ln; num++){
                //System.out.println(feats[num]);
            }
            out.close();
        }
        catch(Exception e){
            System.out.println("cannot read data!");
        }
        
    }

   
}