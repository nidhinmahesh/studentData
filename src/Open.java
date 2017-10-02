import java.util.Scanner;

public class Open{

    //main class file
    public static void main(String[] args){
        //all variables
        int n;

        //all object declaration
        //get details
        Status stat = new Status();
        //create new file
        Entry ent = new Entry();
        // add a new feature
        AddFeature add = new AddFeature();
        //delete a feature 
        DeleteFeature del = new DeleteFeature();
        //search among files
        //Search sr = new Search();
        //to create a zipfile of all the files
        ZipIt zip = new ZipIt();
        //parent console
        Parent prt = new Parent();
        //student console
        Student std = new Student();
        //to edit files use same entry class.
        //input
        Scanner s = new Scanner(System.in);
        //fetch common details like roll number
        Fetch fet = new Fetch();
        System.out.println("\n"+"\n");
        stat.getTime();
        stat.getDate();
        System.out.println("change log saved to edited files. Check for details."+"\n");
        System.out.println("enter option: 1.New Entry  2.Search  3.Add new Feature  4.Delete feature  5.Export as Zip"+"\n"+
        "  6.export via Email  7.Edit student details  8.All files  9.Backup and Restore"
        +"\n"+"\n"+"You are logged in as Faculty. Enter  8.Switch to Student  9.Switch to Parent");

        n = s.nextInt();
        switch (n) {
            case 1:
                ent.readData(ent.lines()); //OK
                break;
            case 2:
                //sr.getList();

                break;
            case 3:
            add.printAllFeats();
            add.getMoreFeats();
                
                break;
            case 4:
                
                break;
            case 5:
            // String ZIP_CREATED = "Data.zip";
            // String SOURCE_FOLDER = "C:\\Users\\hp\\Desktop\\S3-OOP-Project\\data";
            //     zip.generateFileList(new File(SOURCE_FOLDER));
            //     zip.zipOut(ZIP_CREATED);
                break;
            case 6:
            ent.readData(ent.lines());
                
                break;
            case 7:
                
                break;
            case 8:       
                
                break;
            case 9:
                
                break;                                                                      
            default:
            System.out.println("   Oops!.. try again with the options above");
                break;
        }
    }
}