package study.week01;

import java.util.Scanner;

public class P10871 {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	int a = scanner.nextInt();
    	int b = scanner.nextInt();
    	
    	int [] arr1 = new int[a];
    	
    	for(int i = 0; i < arr1.length; i++) {
    		arr1[i] = scanner.nextInt();
    		
    	}
    	
    	scanner.close();
    	
    	for(int i = 0; i < arr1.length; i++) {
    		if(arr1[i] < b) {
    			System.out.println(arr1[i]);
    		}
    	}
	}

}
