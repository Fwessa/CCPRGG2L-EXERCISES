import java.io.*;
import java.util.*;

public class Exp5 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ArrayIndexOutOfBoundsException {
        
        // >> File Reader <<
        // Rename input file path if needed
        
        File inputFile = new File("dummy.txt");
        Scanner inFile = new Scanner(inputFile);

        // >> File Writer <<
        // Rename output file path if needed

        File outFile = new File("reverse.txt");
        FileWriter fw = new FileWriter(outFile, false);
        
        // >> Arraylist <<
        ArrayList<String> listS = new ArrayList<String>();

        try{

            while(inFile.hasNextLine()){
                listS.add(inFile.nextLine());
            }
            Collections.reverse(listS);
            // >> To Access the listS Array <<
            for (String data : listS) {
                String[] counter = data.split("[ \t\n,?.!()\"]+");
                for (int i = counter.length - 1; i >= 0; i--) {
                    fw.write(counter[i]+ " ");
                }
            fw.write("\n");
            }  
       }
        catch(Exception e) {
            System.out.println("An error has occurred: "+ e.getMessage());
        }
        finally{
            inFile.close();
            fw.close();
            fw.flush();
        }
    }
}
