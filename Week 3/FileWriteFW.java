
import java.io.*;



public class FileWriteFW {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        
        File outFile = new File("output.txt");
        System.out.println("File Path: "+ outFile.getAbsolutePath());
        FileWriter fw = new FileWriter(outFile, true);
        //FileWriter fw = new FileWriter(outFile);
        
        try{
            fw.write("This is the first line.");
            fw.write("This is the second line.");
            
        }
        catch(Exception e){
            System.out.println("Error has occured when writing file: "+ e.getMessage());
        }
        finally{
            fw.flush();
            fw.close();
        }
    }
}