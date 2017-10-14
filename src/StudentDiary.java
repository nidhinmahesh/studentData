import java.util.*;
import java.io.*;

public class StudentDiary{
    public static void main(String[] args){
        int n=0;
        SeeAllAtOnce get = new SeeAllAtOnce();
        Status stat = new Status();
        Entry ent = new Entry();
        AddFeature add = new AddFeature();
        DeleteFeature del = new DeleteFeature();
        ZipIt zip = new ZipIt();
        Parent prt = new Parent();
        Student std = new Student();
        Scanner s = new Scanner(System.in);
        Fetch fet = new Fetch();
        System.out.println("\n"+"\n");
        stat.getTime();
        stat.getDate();
        System.out.println("change log saved to edited files. Check for details."+"\n");
        System.out.println("enter option: 1.New Entry  2.Search  3.Add new Feature  4.Delete feature  5.Export as Zip"+"\n"+
        "  6.Add Remainder  7.Edit student details  8.All files  9.Backup and Restore"
        +"\n"+"\n"+"You are logged in as FACULTY. Enter  8.Switch to Student  9.Switch to Parent"+"\n"+
        "NOTE: you can prompt to skip any data entry input using ENTER key");

        n = s.nextInt();
        switch (n) {
            case 1:
                get.READY();
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