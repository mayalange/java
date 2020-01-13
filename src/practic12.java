import java.util.Scanner;

public class practic12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение строки: ");
        String stroka = in.nextLine();
        String strokabezprobel = stroka.replaceAll(" ", "");
        System.out.println("Ваше значение: " + strokabezprobel);

    }
}