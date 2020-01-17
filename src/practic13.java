import java.util.Scanner;

public class practic13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение первой строки: ");
        String stroka1 = in.nextLine();
        System.out.print("Введите значение второй строки: ");
        String stroka2 = in.nextLine();
        if (stroka1.length() > stroka2.length()) {
            System.out.print("Строка с наибольшой длиной: " + stroka1);
        }
        else if (stroka2.length() > stroka1.length()) {
            System.out.print("Строка с наибольшой длиной: " + stroka2);
        }
        else if (stroka2.length() == stroka1.length()){
            System.out.print("Длины строк равны" );
        }

    }
}