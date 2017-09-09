import java.util.List;
import java.util.zip.ZipOutputStream;

public class ZipIt{
    private List <String> fileList;
   private static final String ZIP_CREATED = "Data.zip";
   private static final String SOURCE_FOLDER = "C:\\Users\\hp\\Desktop\\S3-OOP-Project\\data";

    public ZipIt(){
        fileList = new ArrayList <String> ();
    }
    public void zipOut(String zipFile){
        byte[] buffer = new byte[1024];
        String source = new File(SOURCE_FOLDER).getName();
        FileOutputStream fos = null;
        ZipOutputStream zos = null;


    }
}