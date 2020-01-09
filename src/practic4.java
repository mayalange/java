import java.util.Scanner;

public class practic4 {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Введите число в бинарном формате: " );
        String bin = in.nextLine();
        int binint = Integer.parseInt(bin);
        System.out.println("Ваше число в десятичном формате: " +  binint);
    }
}
