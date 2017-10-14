import java.util.ArrayList;

import adapter.*;

public class SeeAllAtOnce{
    int n=10;
    Acheivements ach = new Acheivements();

    public void READY(){
        ArrayList<String> arrli = new ArrayList<String>(n);
        arrli.add(ach.GET());
    
        int size=arrli.size();
        System.out.println(size);

    }
}