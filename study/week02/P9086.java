package study.week02;

import java.util.Scanner;

public class P9086 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        String[] stAr = new String[n];
        
        for (int i = 0; i < n; i++) {
        	stAr[i] = scanner.next();
        }
        
        for (int i = 0; i < stAr.length; i++) {
        	System.out.println("" + stAr[i].charAt(0) + stAr[i].charAt(stAr[i].length() - 1));
        }
        
        scanner.close();
    }

}
