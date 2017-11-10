import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExamMarks{

    Scanner scan = new Scanner(System.in);

    public void getMarks()
    {
        //ask roll and give
       
    }


    int i=0;
    int k=0;
    String[] get = new String[100];


    public void ask()
    {
        get[i] = scan.next();
        i++;
    }

    public void addMarks()
    {

        System.out.println("Roll number: ");
        ask();
        System.out.println("Semester: ");
        ask();
        System.out.println("Exam type: ");
        ask();
        System.out.println("marks: ");
        
        try{

            FileWriter fw = new FileWriter("marks.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);
            
                out.print("\n");
                while(i>=0)
                {
                    out.print(get[k]+"\t");
                    
                    k++;
                    i--;
                }
                
                out.close();
                
                System.out.println("done.|/");
            }
            catch(Exception e)
            {
                System.out.println("Cannot add student marks: "+e);
            }
    }
    
}