import java.util.Scanner;

public class practic14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String S = in.nextLine();
        int X = Integer.parseInt(S);
        double Y = (double)X;
        System.out.print(S + "\n" + X +"\n" + Y + "" + "\n");
    }
}