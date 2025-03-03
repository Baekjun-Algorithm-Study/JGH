package study.week08;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();
        
        int day = 0;
        
        int position = 0;

        while (position < v) {
            day++;
            position += a;
            if (position >= v) break;
            position -= b;
        }
        System.out.println(day);
        
    }
}
