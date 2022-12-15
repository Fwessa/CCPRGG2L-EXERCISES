
import java.io.*;


public class FileReadBR {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        // Declaration for file
        File inFile = new File("C:\\Users\\dalalt\\Documents\\NetBeansProjects\\JavaApplication1\\input.txt");
        BufferedReader br = new BufferedReader(new FileReader(inFile));
        
        try{
            String text;
            while((text = br.readLine()) != null) {
                System.out.println(text);
            }
        }
        catch(Exception e) {
            System.out.println("There is an error reading a file: ");
            System.out.println(e.getMessage());
        }
        finally{
            br.close();
        }
    }
}
