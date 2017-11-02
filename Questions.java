import java.util.*;
public class Questions{
//create object q and call q.ask for one scanner. 
    Scanner scan = new Scanner(System.in);
    String c;
    //replace char with generics
    public String get(){
        c = scan.next();
        return c;
        //implemented like their_variable = ask();
    }
}