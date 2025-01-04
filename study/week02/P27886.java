package study.week02;

import java.util.Scanner;

public class P27886 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String st = scanner.next();
        int n = scanner.nextInt() - 1;
        
        System.out.println(st.charAt(n));
        
        scanner.close();
    }

}
