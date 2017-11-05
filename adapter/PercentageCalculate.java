public class PercentageCalculate{
    public int attendace(int total,int attend){
        this.total= total;
        this.attend=attend;
        int percent = (attend/total)*100;
        return percent;
    }
}