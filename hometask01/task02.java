package hometask01;
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = in.nextInt();
        boolean res = year % 4 == 0 || ((year % 100 == 0) && (year % 400 == 0));
        System.out.println(res);
    }

}
