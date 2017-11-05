public class LowAttendanceAlert{
    public boolean attendanceAlert(int percentage)
    {
        this.percentage = percentage;
        if(percentage<75)
        return false;
        else{
            return true;
        }
    }
}