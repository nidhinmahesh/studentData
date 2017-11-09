import java.util.Scanner;

public class StudentDiary{
    public static void main(String[] args){

        System.out.println("Tell us about yourself:  1.Faculty  2.Student  3.Parents  4.quit");


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        switch(n){
            case 1:
            Faculty fac = new Faculty();
            fac.callFun();
            break;
            
            case 2:
            Student st = new Student();
            st.callFun();
            break;

            case 3:
            Parent par = new Parent();
            par.callFun();
            break;

            case 4:
            System.exit(0);
        }
    }
}