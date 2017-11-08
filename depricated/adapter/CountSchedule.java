public class CountSchedule{
    AcademicSchedule ac = new AcademicSchedule();
    public void printCount(){
        int count = ac.getCount();
        System.out.println("you have"+count+" schedule.");
    }
}