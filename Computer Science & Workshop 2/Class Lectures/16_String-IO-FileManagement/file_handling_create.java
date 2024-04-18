import java.io.*;

public class file_handling_create
{
    public static void main(String[] args)
    {
        try{
            File obj = new File("myfile.txt");
            if(obj.createNewFile())
                System.out.println("File created: " + obj.getName());
            else
                System.out.println("File already exists");
        }
        catch(IOException e){
            System.out.println("An error has occured.");
        }
    }
}

/* File created: myfile.txt          //if new file is created
File already exists                  //if file is already there*/
