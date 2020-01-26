import java.io.*;

public class practic18 {
        public static void main (String agrs[]) throws IOException
        {
            FileReader myfile = new FileReader("C:\\Users\\Xiaomi\\Desktop\\New.txt");
            BufferedReader myfile_1 = new BufferedReader(myfile);

            int i = 0;
            int j = 0;

            String S;
            while ((S = myfile_1.readLine()) !=null)
            {
                i++;
                System.out.println(S);
            }
            System.out.println("Количество строк в файле для перезаписи = "+i);

            FileWriter myfile_2 = new FileWriter("C:\\Users\\Xiaomi\\Desktop\\New.txt");
            BufferedWriter stop = new BufferedWriter(myfile_2);
            BufferedReader crot = new BufferedReader(new InputStreamReader(System.in));

            while (j != i)
            {
                System.out.println("Введите "+(j+1)+" строку в файл");
                String v = crot.readLine();
                stop.write(v+"\r\n");
                j++;
            }

            myfile_1.close();
            crot.close();
            stop.close();
        }

    }
