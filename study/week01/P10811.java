package study.week01;

import java.util.Scanner;

public class P10811 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
    	int m = scanner.nextInt();
    	int[] arr = new int[n];
    	
    	int temp = 0;
    	
    	for(int i = 0; i < arr.length; i++) {
    		arr[i] = i + 1;		
    	}
    	for(int i = 0; i < m; i++) {
    		int a = scanner.nextInt() - 1;
    		int b = scanner.nextInt() - 1;
    		
    		for (int j = 0; a < b; a++, b--) {
    	        temp = arr[a];
    	        arr[a] = arr[b];
    	        arr[b] = temp;
    	    }
    	}
    	
    	for(int i = 0; i < arr.length; i++) {
    		System.out.println(arr[i] + " ");
    	}
    	
       
    }

}
