import java.util.Scanner;

public class practic9 {
    public static void main(String[] args) {
        int n;
        int[] array;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        n = in.nextInt();
        array = new int[n];


        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * n);
            System.out.print(array[i] * 2 + " ");
        }
    }
}