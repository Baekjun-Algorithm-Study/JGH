package study.week01;

import java.util.Scanner;

public class P1546 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int max = 0;
        double tot = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            tot += (double) arr[i] / max * 100;
        }

        double avg = tot / n;
        System.out.println(avg);
    }

}
