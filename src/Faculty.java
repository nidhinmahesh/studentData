import java.util.Scanner;

public class Faculty{
    public void callFun()
    {
        System.out.println("How do you like me to help you: "+'\n'+"1.Add new Student  2.add exam marks  3.remove student  4. add exam schedule  5.give remarks  6.enter fee details  7.quit");
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        

        switch(n){

            case 1:
            AddStudent adds = new AddStudent();
            adds.newStudent();
            break;

            case 2:
            ExamMarks marks = new ExamMarks();
            marks.addMarks();
            break;

            case 3:
            RemoveStudent remove = new RemoveStudent();
            remove.deleteExisting();
            break;

            case 4:
            AddExamSchedule schedule = new AddExamSchedule();
            schedule.addSchedule();
            break;

            case 5:
            TeacherRemarks remarks = new TeacherRemarks();
            remarks.giveRemarks();

            case 6:
            FeeDetails fee = new FeeDetails();
            fee.enterFeeDetails();

            case 7:
            System.exit(0);

        }
    }
}