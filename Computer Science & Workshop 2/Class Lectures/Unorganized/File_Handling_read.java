import java.io.*;
import java.util.*;

public class File_Handling_read {
    public static void main(String[] args) {
            try{
                File obj=new File("myfile.txt");
                Scanner Reader=new Scanner(obj);
                while(Reader.hasNextLine()){
                    String data=Reader.nextLine();
                    System.out.println(data);
                }
                Reader.close();
            }
            catch(FileNotFoundException e){
                System.out.println("file not found");
            }
    }
}
