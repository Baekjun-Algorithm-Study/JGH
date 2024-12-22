package study.week01;

import java.util.Scanner;

public class P10813 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int a = scanner.nextInt();
       int b = scanner.nextInt();
       int temp;

       int[] arr = new int[a];
       for (int i = 0; i < arr.length; i++) {
           arr[i] = i + 1;
       }
       for (int j = 0; j < b; j++) {
           int c = scanner.nextInt();
           int d = scanner.nextInt();

           temp = arr[c-1];
           arr[c-1] = arr[d-1];
           arr[d-1] = temp;
    }
    for (int k = 0; k < arr.length; k++) {
        System.out.print(arr[k] + " ");
        }
    }

}
