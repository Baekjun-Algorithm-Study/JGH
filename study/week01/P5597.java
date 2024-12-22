package study.week01;

import java.util.Scanner;

public class P5597 {
	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);

	       boolean arr[] = new boolean[31];

	       for(int i = 0; i < 28; i++) {
	           arr[scanner.nextInt()] = true;
	       }
	       for (int j = 1; j <= 30; j++) {
	           if(arr[j] != true) {
	               System.out.println(j);
	           }

	       }
	}

}
