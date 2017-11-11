import java.util.*;
import java.io.*;

public class Student{

    public void callFun()
    {
        System.out.println("How do you like me to help you: "+'\n'+"1.See your details  2.Exam marks  3.Fee details  4. exam schedule  5.quit");
        Scanner scan = new Scanner(System.in);
        // SeeDetails details = new SeeDetails();
        
        int n = scan.nextInt();
        switch(n){

            case 1:
            SeeDetails details = new SeeDetails();
            details.getDetails();
            break;

            case 2:
            ExamMarks seeMarks = new ExamMarks();
            seeMarks.getMarks();
            break;

            case 3:
            FeeDetails fee = new FeeDetails();
            fee.getFeeDetails();
            break;

            case 4:
            ExamSchedule schedule = new ExamSchedule();
            schedule.getSchedule();
            break;

            case 5:
            System.exit(0);

        }
    }
}