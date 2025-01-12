package study.week04;

import java.util.Scanner;

public class P10798 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[][] array = new char[5][15];
        
        
        for(int i = 0; i < array.length; i++) {
        	String str = sc.next();
        	for(int j = 0; j < str.length(); j++) {
        		array[i][j] = str.charAt(j);
        	}
        	
        }
        
        for(int i = 0; i < 15; i++) {
        	for(int j = 0; j < 5; j++) {
        		if(array[j][i] == '\0') 
        			continue;
        		System.out.print(array[j][i]);
        	}
        }
        sc.close();
    }

}
