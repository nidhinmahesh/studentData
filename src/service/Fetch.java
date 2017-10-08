import java.util.Scanner;

public class Fetch{
    Scanner s = new Scanner(System.in);
    public String roll(){
        System.out.print("Enter student roll number: ");
        String ROLL_NUMBER = s.next();
        return ROLL_NUMBER;
    }
}