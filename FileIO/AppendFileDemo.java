import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class AppendFileDemo{
    public static void main(String[] args){

        try{
            String content = "This will be appended.";
            File file = new File("writeFile.txt");

            if(!file.exists()){
                file.createNewFile();
            }

            // here true is for appending 
            FileWriter fw = new FileWriter(file,true);

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
            System.out.println("The text is appended to the file successfully.");
        }catch(IOException ioe){
            System.out.println("Exception occured.");
            ioe.printStackTrace();
        }
    }
}