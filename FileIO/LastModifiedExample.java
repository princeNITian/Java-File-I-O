import java.io.File;
import java.text.SimpleDateFormat;

public class LastModifiedExample{
    public static void main(String[] args){
        File file = new File("Myfile.txt");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println("Last Modified On: "+sdf.format(file.lastModified()));
    }
}