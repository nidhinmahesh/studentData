import java.io.*;
import java.util.*;
import adapter.*;
import sun.net.www.content.text.plain;
public class ForStudent{
    public void call(){
        TellThem t = new TellThem();
        //CreateDiary cd = new CreateDiary();
        t.tell("Changed to Student page. Here you can know how you teachers want you to improve,  You can add your daily activity and let your teachers know more about your interest.");
        t.tell("Enter your roll number: ");
        Scanner q = new Scanner(System.in);
        int rollNumber = q.nextInt();
        t.tell("1.todays diary  2.see attendance  3.see marks  4.Leave a message for teacher.");
        int n=0;
        n=q.nextInt();
        switch(n){
            case 1:
            //cd.createToday(rollNumber);
            //create a diary with todays date and his roll number
            break;
            case 2:
            //see attendance line in his profile made by teacher
            break;
            case 3:

            break;
            case 4:
            MessageForTeacher msg = new MessageForTeacher();
            msg.messageTeacher(rollNumber);
        }



    }    
}