import java.io.*;
import java.util.Scanner;

public class Entry{
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
        for(int num = 1; num<=ln; num++){
            try{
                String str = s.next();
            }
            catch(Exception e){
                System.out.println("cannot read data!");
            }
        }
    }

   
}