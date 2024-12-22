package study.week01;

import java.util.Scanner;

public class P10818 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[scanner.nextInt()];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
