import java.io.*;

public class Entry{
    int line = 0;
    public Entry(){

    }
    
    public void lines(){
    try {
        BufferedReader reader = new BufferedReader(new FileReader("features.txt"));
        while((reader.readLine()) != null)line++;
        reader.close();
        
    } catch (Exception e) {
        System.out.println("Oops! Cannot fetch features..");
    }

    System.out.println("you have "+line+" features");
    }


   
}