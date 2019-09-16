import java.io.IOException;
import java.io.File;

// Creating a new File in Java..
public class CreateFileDemo{
    public static void main(String[] args){

        try{
            File file = new File("newFile.txt");
            // File file = new File("/root/Desktop/newFile.txt");
            boolean fVar = file.createNewFile();

            if(fVar){
                System.out.println("File created Successfully.");
            }else{
                System.out.println("File already present at specified location.");
            }
        }catch(IOException e){
            System.out.println("Exception Occurred.");
            e.printStackTrace();
        }
        
    }
}