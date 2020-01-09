import java.util.Scanner;

public class practic6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числa: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int srd = (x + y + z) / 3;
        System.out.println("Среднее арифметическое: " + srd);
        int d = srd / 2;
        if (d > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}