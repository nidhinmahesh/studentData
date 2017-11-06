public class AcademicSchedule{
    int line=0;
    public void newSchedule(){
        

        ArrayList<String> ar = new ArrayList<String>();
        //a file for teacher message. Will be read up when the array is not empty
        try{
            String line;
            BufferedReader reader = new BufferedReader(new FileReader("Schedule.txt"));
            while((line = reader.readLine())!= null)
            {
                line++;
                ar.add(line);
            }       

            System.out.println("Add your schedule. press ENTER when done : ");  
            String currentMsg = s.nextLine();
            ar.add(currentMsg);
            System.out.println("Done.");
        }        
        catch(Exception e)
        {
            System.out.println(e);
        }


    }
    public int getCount(){
        return line;
    }
}