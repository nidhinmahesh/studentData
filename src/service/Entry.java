import java.io.*;
import java.util.Scanner;
public class Entry{
    int i =0;
    int line = 0;
    Status stEnt = new Status();
    Scanner s = new Scanner(System.in);
    Fetch fet = new Fetch();
    public int lines(){
        try {            
            BufferedReader reader = new BufferedReader(new FileReader("features.txt"));
            while((reader.readLine()) != null){
                line++;
            }
            String[] feats = new String[line];
            while((reader.readLine()) != null){
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
        System.out.println(" ");
        System.out.println(ln+" queries needed");
        
        try{
            String ROLL_NUMBER = fet.roll();
            String name = "T"+ROLL_NUMBER + ".txt";
            FileWriter out = null;
            out = new FileWriter(name);
            String[] dataRead = new String[line];
            int k = 0;
            String thisLine;
            BufferedReader reader = new BufferedReader(new FileReader("features.txt"));
             while((thisLine = reader.readLine()) != null){
                System.out.println(thisLine);
                dataRead[k] = s.nextLine();
                out.write(dataRead[k]+ '\n');
                k++;
            }
            System.out.println("Entry added successfully.");
            out.close();
        }
        catch(Exception e){ 
            System.out.println("cannot read data!  Error: "+ e);
        }
    }
}