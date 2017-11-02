import java.util.*;
public class StudentDiary{
    public static void main(String[] args){
        TellThem t = new TellThem();
        TimeStamp stat = new TimeStamp();
        System.out.println("\n"+"\n");
        stat.getTime();
        stat.getDate();
        Entry ent = new Entry();        
        t.tell("change log saved to edited files. Check for details.");
        t.tell("enter option: 1.New Entry  2.Search  3.Add new Feature  4.Delete feature  5.Export as Zip  6.Add Remainder  7.Edit student details  8.All files  9.Backup and Restore. You are logged in as FACULTY. Enter  8.Switch to Student  9.Switch to Parent.  NOTE: you can prompt to skip any data entry input using ENTER key");
        ForStudent student = new ForStudent();
        ForParents parents = new ForParents();
        Scanner s = new Scanner(System.in);


        int n = s.nextInt();
        switch (n) {
            case 1:
            //get.READY();
            ent.readData(ent.lines());
                break;
            case 2:

                break;
            case 3:

                
                break;
            case 4:
                
                break;
            case 5:

                break;
            case 6:

                break;
            case 7:
                
                break;
            case 8:       
                student.call();
                break;
            case 9:
                parents.call();
                break;                                                                      
        }
    }
}