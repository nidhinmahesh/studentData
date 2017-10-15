import java.io.*;
import java.util.*;

import adapter.*;

public class SeeAllAtOnce{
    int n=10;
    Acheivements ach = new Acheivements();
    Address add = new Address();

    public void READY(){
        //out = new FileWriter("features.txt");
        ArrayList<String> arrli = new ArrayList<String>(n);
        arrli.add(ach.GET());
        arrli.add(add.GET());
        //write it into features.txt at once
    //     try{
    //         BufferedWriter fw = new BufferedWriter(new FileWriter("features.txt"));
    //     for(int i=0;i<=size;i++){
    //         out.write("until arril its working");
    //     }
    // }catch(IOException ioe){
    //     System.out.println(ioe);
    // }
    ///////// write into features.txt////////////////
//     Iterator itr=arrli.iterator(); 
//     BufferedWriter out = null;
//     out = new BufferedWriter(new FileWriter("features.txt"));
//     while(itr.hasNext()){
//         out.write(Integer.toString());
//         out.newLine();
//     }
    }
}