import java.io.*;
import java.util.*;
public class FindFile{
    public void findfile(String name,File file)
    {
        File[] list = file.listFiles();
        if(list!=null)
        {
        	for(File fil : list)
        	{
        		if(fil.isDirectory())
        		{
        			findFile(name,fil);
        		}
        		else if(name.equalsIgnoreCase(fil.getName()))
        		{
        			System.out.println(fil.getParentFile());
        		}
        	}
        }
    }
}