package study.week02;

import java.util.Scanner;

public class P11720 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String st = scanner.next();
        int tot = 0;
        
        for(int i = 0; i < n; i++) {
        	tot += st.charAt(i) - '0';
        }
        
        System.out.println(tot);
    }

}
