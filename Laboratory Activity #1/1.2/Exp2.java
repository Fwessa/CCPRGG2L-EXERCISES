import java.io.*;

public class Exp2 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        // Declaration for file
        File inFile = new File("dummy.txt");
        BufferedReader br = new BufferedReader(new FileReader(inFile));
        
        int ln = 5; // lines you wanted to read
        int a = 1;

        try{
            // file reader
            String text;
            while((text = br.readLine()) != null) {
                
                System.out.println(text);
                // to stop the loop with an output of 5 lines
                if(a == ln){ 
                    break;
                }
            a++;
        }
    }
        catch(Exception e) {
            System.out.println("An error has occurred: "+ e.getMessage());
        }
        finally{
            br.close();
        }
    }
}
