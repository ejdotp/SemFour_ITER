import java.io.FileWriter;
import java.io.IOException;
public class file_handling_write
{
    public static void main(String[] args)
    {
        try{
            FileWriter Writer = new FileWriter("myfile.txt");
            Writer.write("Hello, I have written something for you");
            Writer.close();
            System.out.println("Successfully written");
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
}
/*
Output: Successfully written
Inside File: Hello, I have written something for you
 */
