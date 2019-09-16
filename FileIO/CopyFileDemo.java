import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class CopyFileDemo {
public static void main(String [] args){
    FileInputStream fin = null;
    FileOutputStream fon = null;

    try{
        File f1 = new File("f1.txt");
        File f2 = new File("f2.txt");

        fin = new FileInputStream(f1);
        fon = new FileOutputStream(f2);

        int length;
        byte[] buffer = new byte[1024];

        while((length=fin.read(buffer))>0){
            fon.write(buffer,0,length);
        }

        fin.close();
        fon.close();
        System.out.println("File successfully Copied.");
    }catch(IOException ioe){
        ioe.printStackTrace();
    }
}
}