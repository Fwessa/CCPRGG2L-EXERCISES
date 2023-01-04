import java.io.*;

public class Exp4 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ArrayIndexOutOfBoundsException {
        
        File inFile = new File("SampleText.txt");
        BufferedReader br = new BufferedReader(new FileReader(inFile));

        String textFile;
        String data = "";

        try{
            while((textFile = br.readLine()) != null) {
            data += textFile;
        }
            String[] counter = data.split("[ \t\n,?.!()\"]+");

            //>> To Access the counter Array <<
            // for (int i = 0; i < counter.length; i++) {
            //     System.out.println("Element " + i + " equals: " + counter[i]);
            // }
            System.out.println("File Word Count: " + counter.length);
        }
        catch(Exception e) {
            System.out.println("An error has occurred: "+ e.getMessage());
        }
        finally{
            br.close();
        }
    }
}
