package study.week03;

import java.util.Scanner;

public class P1316 {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	int a = scanner.nextInt();
    	int count = 0;
    	
    	for(int i = 0; i < a; i++) {
    		boolean[] check = new boolean[26];
    		int prev = 0;
    		boolean isGroupWord = true;
    		String str = scanner.next();
    		
    		for(int j = 0; j < str.length(); j++) {
    			int now = str.charAt(j);
    			
    			if(prev != now) {
    				if(check[now -'a']) {
    					isGroupWord = false;
    					break;
    				}
    				check[now - 'a'] = true;
        			prev = now;
    			}
    		}
    		if (isGroupWord) {
    			count++;
    		}
    	}
    	System.out.println(count);
    	
        
    }

}
