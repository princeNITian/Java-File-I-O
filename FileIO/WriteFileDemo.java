import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

// Writing to a file...
public class WriteFileDemo{
public static void main(String [] args){
    FileOutputStream fos=null;
    File file;
    String myContent = "This is my content "+"which is to be written in file.";

    try{
        file = new File("writeFile.txt");
        fos = new FileOutputStream(file);

        // If file doesn't exist
        if(!file.exists()){
            file.createNewFile();
        }
        // converting string to bytes
        byte [] byteArray = myContent.getBytes();

        fos.write(byteArray);
        fos.flush();
        System.out.println("File written Successfully.");
    }catch(IOException ioe){
        ioe.printStackTrace();
    }

    finally{
        try{
            if(fos != null){
                fos.close();
            }
        }catch(IOException e){
            System.out.println("Error in closing the stream.");
        }
    }

}
}