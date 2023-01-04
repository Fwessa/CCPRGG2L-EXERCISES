import java.io.*;


public class Exp3 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        // Declaration for file
        File inFile = new File("dummy.txt");
        BufferedReader br = new BufferedReader(new FileReader(inFile));
        
        // ArrayList<String> listS = new ArrayList<String>();

        int ln = 5; // lines you wanted to read
        int loop = 1;

        String data = "";

        try{
            // file reader
            String text;
            while((text = br.readLine()) != null) {

                // store to string
                data = data + text;
        
                // to stop the loop with an output of 5 lines
                if(loop == ln){ 
                break;
                }
            loop++; 
        }

        // for checking if the lines are stored in data string
        // System.out.println(data);
        System.out.println(" ");

        int a = 0; 
        int e1 = 0;
        int i = 0;
        int o = 0;
        int u = 0;


        for (int index = 0; index < data.length(); index++) {
            char counter = data.charAt(index);

            if( counter == 'A' || counter == 'a'){
                a += 1;
            }
            else if( counter == 'E' || counter == 'e'){
                e1 += 1;
            }
            else if( counter == 'I' || counter == 'i'){
                i += 1;
            }
            else if( counter == 'O' || counter == 'o'){
                o += 1;
            }
            else if( counter == 'U' || counter == 'u'){
                u += 1;
            }
        }
    
    //System.out.println(">> DATA: " + data);
    System.out.println(">>  VOWELS <<");
    System.out.println("A: " + a);
    System.out.println("E: " + e1);
    System.out.println("I: " + i);
    System.out.println("O: " + o);
    System.out.println("U: " + u);

    }
        catch(Exception e) {
            System.out.println("An error has occurred: "+ e.getMessage());
        }
        finally{
            br.close();
        }
    }
}
