import java.util.Scanner;
public class itog1 {

    public static void main (String agrs[])
    {
        Scanner b = new Scanner(System.in);
        System.out.println("Введите целое бинарное число x: ");
        String y = b.nextLine();
        String j = "^-*[0-1]+$";
        int a = 0;
        if (y.matches(j))
        {
            char [] mas = y.toCharArray();
            if (mas [0] == '-')
            {
                for (int i = 1; i < y.length(); i++)
                {
                    a = a*2 + Character.getNumericValue(mas [i]);
                }
                a = - a;
                System.out.println("Ваше число в десятичной системе = "+a);
            }
            else
            {
                for (int i = 0; i < y.length(); i++)
                {
                    a = a*2 + Character.getNumericValue(mas [i]);
                }
                System.out.println("Ваше число в десятичной системе = "+a);
            }

        }
        else
        {
            System.out.println("Вы ввели не бинарное число");
        }
    }
}

