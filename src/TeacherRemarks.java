public class TeacherRemarks{
    Scanner scan = new Scanner(System.in);

    int i=0;
    int k=0;
    String[] get = new String[100];



    public void giveRemarks()
    {

    }

    public void ask()
    {
        get[i] = scan.next();
        i++;
    }
    

    public void getTeacherRemarks()
    {
        System.out.println("Roll number: ");
        ask();
        System.out.println("Remarks: ");
        ask();
        
        try{

            FileWriter fw = new FileWriter("remarks.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);
            
                out.print("\n");
                while(i>=0)
                {
                    out.print(get[k]+"\t");
                    
                    k++;
                    i--;
                }
                
                out.close();
                
                System.out.println("done.|/");
            }
            catch(Exception e)
            {
                System.out.println("Cannot add student marks: "+e);
            }
    }
    
}


