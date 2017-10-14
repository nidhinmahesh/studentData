import java.io.*;
import java.util.*;

public class AddFeature{
    int n = 10;
    String ok = "ok";
    ArrayList<String> arrli = new ArrayList<String>(n);
    Scanner s = new Scanner(System.in);
    public void printAllFeats(){
    	try{
	        String thisLine;
	        BufferedReader reader = new BufferedReader(new FileReader("features.txt"));
	        while((thisLine = reader.readLine())!= null){
	            System.out.println(thisLine);
	            arrli.add(thisLine);
    	        }
	        System.out.println("\n"+"these are the existing features you have added, add more below. Enter 'ok' on finishing editing");
    	}
    	catch(IOException e){
    		System.out.println("Cannot read "+ e);
    	}
    }
    public void getMoreFeats(){
        String sNEW = s.nextLine();
        try{
        if(ok.equals(sNEW)){
            PrintWriter out = new PrintWriter(new FileWriter("features.txt"));
            for(int i = 0;i<=arrli.size();i++){
                out.println(arrli.add(sNEW));
         }
        }else{
                //System.out.println(arrli.size());
                arrli.add(sNEW);
                getMoreFeats();
            }
            
        }
        catch(IOException e){

            System.out.println("Cannot read "+ e);
        }
    
    }
}