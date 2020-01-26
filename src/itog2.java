import java.util.InputMismatchException;
import java.util.Scanner;

public class itog2
{
    public static void main (String agrs[])
    {
        sort_mas(mas());
    }

    private static double[] mas()
    {
        Scanner god = new Scanner(System.in);
        System.out.println("Введите количество цифр в массиве: ");
        int razmer = god.nextInt();
        double[] nes_masssiv = new double[razmer];

        for (int i = 0; i < razmer; i++) {
            System.out.println("Введите " + i + " элемент массива");
            try
            {
                nes_masssiv[i] = god.nextDouble();
            }
            catch (InputMismatchException ex)
            {
                god.nextLine();
                System.out.println("Введите дробное число через \',\'");
                i = i - 1;
            }
        }
        return nes_masssiv;
    }
    private static void sort_mas(double A[])
    {
        for (int i=0; i<A.length; i++)
        {
            System.out.print(A[i]+" ");
        }
        double min;
        int min_2 =0;
        for (int x=0; x<A.length; x++)
        {
            int samoe_minimal = x;
            for (int i = samoe_minimal + 1; i < A.length; i++)
            {
                if (A[i] < A[samoe_minimal] )
                {
                    samoe_minimal = i;}
            }
            double buf = A[samoe_minimal];
            A[samoe_minimal] = A[x];
            A[x] = buf;
        }
        System.out.println();
        for (int k=0; k<A.length; k++)
        {
            System.out.print(A[k]+"   ");
        }

    }
}