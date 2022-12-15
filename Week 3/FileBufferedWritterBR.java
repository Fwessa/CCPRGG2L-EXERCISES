
import java.io.*;



public class FileBufferedWritterBR {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        
        File outFile = new File("output.txt");
        System.out.println("File Path: "+ outFile.getAbsolutePath());
        FileWriter fw = new FileWriter(outFile, true);
        //FileWriter fw = new FileWriter(outFile);
        BufferedWriter bw = new BufferedWriter(fw);
        
        try{
            bw.write("This is a text from the buffered writer");
            bw.newLine();
            bw.write("This is another line from bw");
            
        }
        catch(Exception e){
            System.out.println("Error has occured when writing file: "+ e.getMessage());
        }
        finally{
            bw.flush();
            bw.close();
        }
    }
}