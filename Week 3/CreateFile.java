// FIle import
import java.io.File;
import java.io.*;


public class CreateFile {
   
    public static void main(String[] args) throws IOException {
        // Declaration for file
        File file = new File("input.txt");
    
    try{
        if (!file.exists()){
            //if(file.createNewFile()){
            // Create a file
            file.createNewFile();
            System.out.println(file.getName() + " successfully created");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.length());
        }else{
            // Checks if the file exist
            System.out.println(file.getName() + " already exists.");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.length());
            // Deletes the file
            file.delete();
            System.out.println("File already deleted");
            }
        }
    catch(IOException e){
        // 
        System.out.println("There is an error: ");
        System.out.println(e.getMessage());
        }  
    }
}
