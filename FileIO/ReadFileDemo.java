import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

// Reading a file that already exists...

public class ReadFileDemo{
    public static void main(String[] args){
        // Create a File instance
        File file = new File("newFile.txt");
        FileInputStream fin = null;
        BufferedInputStream bin = null;
        try{
            fin = new FileInputStream(file);
            bin = new BufferedInputStream(fin);

            while(bin.available()>0){
                System.out.print((char)bin.read());
            }
        }catch(FileNotFoundException fnfe){
            System.out.println("File not found: "+ fnfe);;
        }catch(IOException e){
            System.out.println("I/O Exception "+e);
        }

        finally{
            try{
                if(bin != null && fin != null){
                    fin.close();
                    bin.close();
                }
            }catch(IOException ioe){
                System.out.println("Error in InputStream Close" + ioe);
            }
        }
    }
}