package study.week01;

import java.util.HashSet;
import java.util.Scanner;

public class P3052 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> r = new HashSet<Integer>();

        for (int i = 0; i < 10; i++){
         r.add(scanner.nextInt() % 42);
        }
        System.out.println(r.size());
    }

}
