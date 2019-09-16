import java.io.File;
class DeleteFileDemo{
    public static void main(String [] args){
        try{
            File file = new File("writeFile.txt");
            if(file.delete()){
                System.out.println(file.getName()+" is successfully deleted.");
            }else{
                System.out.println("Delete file failed..");
            }
        }catch(Exception e){
            System.out.println("Exception occured.");
            e.printStackTrace();
        }
    }
}