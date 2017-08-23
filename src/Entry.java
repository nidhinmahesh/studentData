import java.io.*;

public class Entry{
    public Entry(){
        

    }
    public int lines(){
    try {
        int line = 0;
        BufferedReader reader = new BufferedReader(new FileReader("features.txt"));
        while((reader.readLine()) != null)line++;
        reader.close();
        // System.out.println("you have "+line+" features");
        return line;
        
        } 
        catch (Exception e) {
            System.out.println("Oops! Cannot fetch features..");
            return 0;
        }
    }
    public void readData(int ln){
        System.out.println(ln+" queries needed");
        
        for(int num = 0; num<=ln; num++){
            
        }
    }

   
}