package study.week02;

import java.util.Scanner;

public class P2908 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
        b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());
        
        System.out.println( a > b ? a : b );
	}

}
