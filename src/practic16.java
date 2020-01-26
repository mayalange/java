import java.util.Scanner;
        import java.io.*;


import java.util.Scanner;
import java.io.*;


public class practic16 {
    public static void main(String args []) {
        String S;
        try (FileInputStream text_1 = new FileInputStream("C:\\test.txt"))
        {
            BufferedReader red_for = new BufferedReader(new InputStreamReader(text_1));
            while ((S = red_for.readLine()) != null) {
                System.out.println(S);
            }
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода " + exc);
        }
    }
}