package study.week03;

import java.util.Scanner;

public class P1157 {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        
        String st = scanner.next().toUpperCase();
        
        int[] arr = new int[26];
        
        for(int i = 0; i < st.length(); i++) {
        	char c = st.charAt(i);
        	arr[c - 'A']++;
        }
        
        int max = 0;
        int count = 0;
        int index = -1;
        for(int i = 0; i < arr.length; i ++) {
        	if(max < arr[i]) {
        		max = arr[i];
        	}
        }
        for(int i = 0; i < arr.length; i ++) {
        	if(max == arr[i]) {
        		count++;
        		index = i;
        	}
        }
        
        if(count > 1) {
        	System.out.println("?");
        } else {
        	System.out.println((char)(index +'A'));
        }
        
    }

}
