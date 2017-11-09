import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class AddStudent{

    public void newStudent()
    {

        String query;
            String[] get = new String[20];
            int i=0;
            int k=0;

            Scanner scan = new Scanner(System.in);

        try{
            
            BufferedReader reader = new BufferedReader(new FileReader("bio.txt"));
            
            while((query = reader.readLine())!= null)
            {
                System.out.println(query);
                get[i] = scan.nextLine();
                i++;


            }
        }
        catch(Exception e){
            System.out.println("Cannot read bio: "+e);
        }



        try(FileWriter fw = new FileWriter("students.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
            {

                while(i>=0)
                {
                    out.print(get[k]+"\t");
                    
                    k++;
                }

                System.out.println("done.|/");
            }

    }
    
}
