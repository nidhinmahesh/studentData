import java.util.Scanner;

public class Open{

    //main class file
    public static void main(String[] args){
        //all variables
        int n;

        //all object declaration
        Status stat = new Status();
        Entry ent = new Entry();
        AddFeature add = new AddFeature();
        DeleteFeature del = new DeleteFeature();
        Search sr = new Search();
        ZipIt zip = new ZipIt();
        Parent prt = new Parent();
        Student std = new Student();
        Authentication auth = new Authentication();
        Scanner s = new Scanner(System.in);

        stat.getTime();
        stat.getDate();
        System.out.println("change log saved to edited files. Check for details."+"\n");
        System.out.println("enter option: 1.New Entry  2.Search  3.Add new Feature  4.Delete feature  5.Export as Zip"+"\n"+
        "  6.add here  7.add here"
        +"\n"+"\n"+"You are logged in as Teacher. Enter  8.Switch to Student  9.Switch to Parent");

        n = s.nextInt();
        s.close();
        switch (n) {
            case 1:

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
            case 8:            //file name should be roll number
            //we search for file number
                auth.checkRoll();
                std.giveDetails();
                
                break;
            case 9:
                
                break;                                                                      
            default:
            System.out.println("   Oops! you are out of the world.. try again with the options above");
                break;
        }
    }
}