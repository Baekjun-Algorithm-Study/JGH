package study.week02;

import java.util.Scanner;

public class P2675 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();        
        
        for (int i = 0; i < n; i++ ) {
        	
        	int a = scanner.nextInt();
        	String st = scanner.next();
        	
        	for(int j = 0; j < st.length(); j++) {
        		for(int k = 0; k < a; k++) {
        			System.out.print(st.charAt(j));
        		}
        	}
        	System.out.println();
        }
        
       
	}

}
