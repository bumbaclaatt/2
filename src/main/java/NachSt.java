
import au.com.bytecode.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class NachSt {
    public static void main(String[] args) throws IOException 
    {
        int i=0;
        int i1=0;
        char test;
        char testt = 'd';
        ArrayList<String> Nach = new ArrayList<String>();
            try
                (CSVReader reader = new CSVReader(new FileReader("c:\\3.csv"),',')) {
                String [] nextLine;
                while ((nextLine = reader.readNext()) != null)
                {
                    for(String token : nextLine)
                    {
                        test = token.charAt(14);
                        System.out.println(test);
                        if (test == testt) {
                           Nach.add(token);
                          System.out.println(Nach.toString());
                        }
                    }
                }
            }  
            catch (FileNotFoundException e) {
            }
                 
    }
}