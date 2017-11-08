public class Parent{

    public void callFun()
    {
        System.out.println("How do you like me to help you: "+'\n'+"1.See Student details  2.Exam marks  3.Fee details  4. exam schedule  5.Teacher remarks  6.quit ");
        Scanner scan = new Scanner(System.in);
        
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
            TeacherRemarks remarks = new TeacherRemarks();
            remarks.getTeacherRemarks();

            case 6:
            System.exit(0);

        }
    }
}