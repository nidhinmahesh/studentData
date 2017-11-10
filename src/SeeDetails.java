public class SeeDetails{

    public void getDetails()
    {
        try{

            File file = new File("bio.txt");
            final Scanner scan = new Scanner(file);

             while(scan.hasNextLine()){
                final String lineFromFile = scan.nextLine();
                 if(lineFromFile.contains(name)){



                    System.out.println("I found " +name+ " in file " +file.getName());


                    
                 }
              }
            
        }
    }
}