import java.util.InputMismatchException;
import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        try {
            System.out.println("введите 4 числа типа int:");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("ошибка ввода данных");
            System.exit(1);
        }
        if (a<=b & a<=c & a<=d ){
            System.out.println("наименьшее число - "+a);
        }
        else if (b<=a & b<=c & b<=d){
            System.out.println("наименьшее число - "+b);
        }
        else if (c<=a & c<=b & c<=d){
            System.out.println("наименьшее число - "+c);
        }
        else if (d<=a & d<=b & d<=c){
            System.out.println("наименьшее число - "+d);
        }
    }
}