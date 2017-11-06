import java.io.*;
import java.util.*;
public class Entry{
    int i =0;
    int line = 0;
    //Status stEnt = new Status();
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
            ////////in built features////////////
        
            int count=0;
           
            //Acheivements ach = new Acheivements();
            // Address add = new Address();
            ArrayList<String> arrli = new ArrayList<String>();
            // arrli.add(ach.GET());
            // arrli.add(add.GET());
            int size=arrli.size();
            String[] dataRead2 = new String[size];
            for(int i=0;i<size;i++){  
                System.out.println(arrli.get(i));
                
                dataRead2[k] = s.nextLine();
                out.write(dataRead2[count]+'\n');
                count++;                
            }
            System.out.println("Entry added successfully.");
            out.close();
        }
        catch(Exception e){ 
            System.out.println("cannot read data!  Error: "+ e);
        }
    }
}