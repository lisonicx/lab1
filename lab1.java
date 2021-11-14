import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        System.out.println("введите 4 числа типа int:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
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