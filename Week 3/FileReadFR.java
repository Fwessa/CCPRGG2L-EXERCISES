
import java.io.*;

public class FileReadFR {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        // Declaration for file
        File inFile = new File("C:\\Users\\dalalt\\Documents\\NetBeansProjects\\JavaApplication1\\input.txt");
        FileReader fr = new FileReader(inFile);
        
        try{
            int i;
            while((i = fr.read()) != -1){
                System.out.print((char) i);
            }
            System.out.println("");
        }
        catch(Exception e){
            System.out.println("There is an error reading a file: ");
            System.out.println(e.getMessage());
            
        }
       
    }    
}
