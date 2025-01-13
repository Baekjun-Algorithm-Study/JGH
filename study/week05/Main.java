package study.week05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        int result = 0;
        
        for(int i = 0; i < str.length(); i++) {
        	char ch = str.charAt(str.length() - 1 - i);
        	
        	int value = 0;
        	
        	if(ch >= '0' && ch <= '9') {
        		value = ch - '0';
        	} else if(ch >= 'A' && ch <= 'Z') {
        		value = ch - 'A' + 10;
        	} else if(ch >= 'a' && ch <= 'z') {
        		value = ch - 'a' + 10;
        	}
        	
        	result += value * Math.pow(n, i);
        	
        	
        }
        System.out.println(result);
        
    }
}
