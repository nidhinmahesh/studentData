import java.io.*;

public class Entry{
    public Entry(){
        

    }
    
    public void lines(){
    try {
        int line = 0;
        BufferedReader reader = new BufferedReader(new FileReader("features.txt"));
        while((reader.readLine()) != null)line++;
        reader.close();
        System.out.println("you have "+line+" features");
        
        } 
        catch (Exception e) {
            System.out.println("Oops! Cannot fetch features..");
        }
    }


   
}