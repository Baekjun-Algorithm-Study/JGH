package study.week06;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 2;
        for (int i = 1; i < n + 1; i++) {
            a = a + (int) Math.pow(2, i - 1);
            System.out.println(a);
        }
        System.out.println((int)Math.pow(a, 2));
    }
}
