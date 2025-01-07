package study.week03;

import java.util.Scanner;

public class P10988 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String st = scanner.next();
        
        char[] stArr = st.toCharArray();
        int x = 1;
        
        for(int i = 0; i < stArr.length / 2; i++) {
        	if(stArr[i] != stArr[stArr.length - i - 1]) {
        		x = 0;
        		break;
        	}
        }
        System.out.println(x);
    }

}
