package study.week05;

import java.util.Scanner;

public class P2720 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
        	int tc = sc.nextInt();
        	
        	int q = tc / 25;
        	tc %= 25;
        	
        	int d = tc / 10;
        	tc %= 10;
        	
        	int nk = tc / 5;
        	tc %= 5;
        	
        	int p = tc;
        	
        	System.out.println(q + " " + d + " " + nk + " " + p);
        }
	}
}
