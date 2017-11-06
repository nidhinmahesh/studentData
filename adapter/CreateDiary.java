import java.util.*;
public class CreateDiary{
    WriteDiary wt = new WriteDiary();
    int DATE=0;
    DateFormat dateFormat = new DateFormat("yyyy+mm+dd");
    Date date = new Date();
    System.out.println(dateFormat.format(date));


    public void createToday(int ROLL)
    {
        String name = "D"+ROLL+DATE+".txt";
        FileWriter out = null;
        out = new FileWriter(name);
        wt.WriteDiary(name);
    }
    
}