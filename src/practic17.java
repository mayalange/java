import java.util.Scanner;
import java.io.*;


public class practic17 {
        public static void main (String agrs[]) throws IOException
        {
            BufferedReader rock = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Если хотите закончить ввод данных, то введителоисыивм \"стоп\"");
            try (FileWriter myfile = new FileWriter("test"))
            {

                while (true)
                {
                    String text = rock.readLine();
                    if(text.equals("стоп")){
                        myfile.write(text);
                        break;
                    }
                    else {
                        myfile.write(text +"\r\n");
                    }
                }
                rock.close();
            }
        }
    }
