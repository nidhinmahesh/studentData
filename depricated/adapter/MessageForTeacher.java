import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class MessageForTeacher{
    Scanner s = new Scanner(System.in);

    public void messageTeacher(int ROLL){
        //create arrayList
        ArrayList<String> ar = new ArrayList<String>();
        //a file for teacher message. Will be read up when the array is not empty
        try{
            String line;
            BufferedReader reader = new BufferedReader(new FileReader("TeacherMsg.txt"));
            while((line = reader.readLine())!= null)
            {
                ar.add(line);
            }       

            System.out.println("Enter your message. press ENTER when done : ");  
            String currentMsg = s.nextLine();
            ar.add(currentMsg);
            System.out.println("Done.");
        }        
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}