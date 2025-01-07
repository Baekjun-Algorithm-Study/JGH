package study.week03;

import java.util.Scanner;

public class P3003 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[6];
        
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 2;
        arr[4] = 2;
        arr[5] = 8;
        
        int[] arr2 = new int[6];
        
        for(int i = 0; i < arr2.length; i++) {
        	arr2[i] = scanner.nextInt();
        }
        scanner.close();
        
        for(int i = 0; i < arr.length; i++) {
        	System.out.println(arr[i] - arr2[i]);
        }
    }

}
