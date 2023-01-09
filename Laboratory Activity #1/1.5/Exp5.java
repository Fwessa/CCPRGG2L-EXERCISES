import java.io.*;

public class Exp5 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ArrayIndexOutOfBoundsException {
        
        File inFile = new File("SampleText2.txt");
        BufferedReader br = new BufferedReader(new FileReader(inFile));
    
        String textFile;
        String data = "";

        try{
            while((textFile = br.readLine()) != null) {
            data += textFile;
        }
            String[] counter = data.split(" ");
            int ln = counter.length -1;
            System.out.println(" ");
            
            
            //>> To Access the counter Array <<
            for (int i = 0; i < counter.length; i++) {
                System.out.print(counter[ln]+ " ");
                ln--;
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
