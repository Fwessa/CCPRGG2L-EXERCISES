import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Exp1 {
    public static void main(String[] args) throws FileNotFoundException, IOException  {
        
        // Input File - data.txt file
        
        File inputFile = new File("data.txt");
        System.out.println("Input File path: "+ inputFile.getAbsolutePath());
        Scanner inFile = new Scanner(inputFile);

        // Output File - sum.txt file
        File outFile = new File("sum.txt");
        System.out.println("Output File path: "+ outFile.getAbsolutePath());
        FileWriter fw = new FileWriter(outFile, false);
        

        try{
            // Used Arraylist to read and store the data from data file

            //ArrayList<String> listS = new ArrayList<String>();
            ArrayList<Integer> listI = new ArrayList<Integer>();

            // for File Reading
            while(inFile.hasNextLine()){
                listI.add(inFile.nextInt());
            }

            // for programmers to know if the syntax is working
            System.out.println("Data: " + listI);
            System.out.println("");

            // to access the Arralist and Add the following and store it to - int total
            int total = 0;
            for (int index = 0; index < listI.size(); index++) {
                total += listI.get(index);
            }
            
            // for programmers to know if the syntax is working
            System.out.println("The sum is: " + total);
            System.out.println(" ");

            // to write the content of the new file - sum.txt
            fw.write("Data Input: "+ listI + "\nThe sum of Data Input: " + total );

        }
            // to catch errors
        catch(Exception e){
            System.out.println("An error has occurred: "+ e.getMessage());

        }
            
        finally{
            inFile.close();
            fw.close();
            fw.flush();
        }
    }
}

