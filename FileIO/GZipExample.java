import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.GZIPOutputStream;

class GZipExample{
    public static void main(String[] args){
        GZipExample zipObj = new GZipExample();
        zipObj.gzipMyFile();
    }

    public void gzipMyFile(){
        try{
        byte[] buffer = new byte[1024];

        GZIPOutputStream gos = new GZIPOutputStream(new FileOutputStream("Myfile.gz"));

        FileInputStream fin = new FileInputStream("Myfile.txt");

        int length;
        while((length = fin.read(buffer))>0){
            gos.write(buffer,0,length);
        }
        fin.close();
        gos.finish();
        gos.close();
        System.out.println("File Compressed.");

    }
catch(Exception e){
    e.printStackTrace();
}
}
}