import java.util.Scanner;

public class practic10 {

    public static void main(String args[]) {

        int[][] mas = massiv();
        System.out.print("Вывод первой строки, умноженной на 3:\n");
        umno(mas);
    }

    public static int[][] massiv() {
        Scanner mass = new Scanner(System.in);
        System.out.println("Введите количество строк первого массива: ");
        int dog = mass.nextInt();
        System.out.println("Введите количество столбцов второго массива: ");
        int dog1 = mass.nextInt();

        int[][] b = new int[dog][dog1];
        for (int i = 0; i < dog; i++)
        {
            for (int j = 0; j < dog1; j++) {
                System.out.print("Введите значение [" + j + "] строки [" + i + "]= \n");
                b[i][j] = mass.nextInt();
            }
        }
        return b;
    }

    private static void umno (int[][] massiv_1)
    {
        for (int i = 0; i < massiv_1[0].length; i++)
        {
            System.out.print("[0][" + i + "] = "+massiv_1 [0][i]*3+"\n");
        }
    }
}