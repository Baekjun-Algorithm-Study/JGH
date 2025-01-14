package study.week05;

import java.util.Scanner;

public class P11005 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        StringBuilder result = new StringBuilder();
        
        while(n > 0) {
        	int c = n % b;
        	char ch = 0;
            if (c < 10) {
            	ch = (char) ('0' + c);
            } else {
            	ch = (char) ('A' + (c - 10));
            }
        	result.append(ch);
        	
        	n /= b;
        }
        
        System.out.println(result.reverse().toString());
    
    }

}
