import java.time.LocalTime;
import java.time.LocalDate;

public class TimeStamp{
    public void getTime(){
        LocalTime time = LocalTime.now();
        System.out.println("Access time: "+time);
    }
    public void getDate(){
        LocalDate date = LocalDate.now();
        System.out.println("Edit date: "+date);
    }
}