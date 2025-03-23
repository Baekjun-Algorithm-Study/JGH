package study.week11;

import java.util.Scanner;

public class P1978 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count = 0;
        
        
        for (int i = 0; i < n; i++) {
        	boolean isPrime = true;
        	
        	int number = sc.nextInt();
        	
        	if(number == 1 || number == 0) {
        		continue;
        	}
        	
        	for(int j = 2; j < number; j++) {
        		if(number % j == 0)  {
        			isPrime = false;
        			break;
        		}
        	}
        	if(isPrime) {
        		count++;
        	}
        	
        }
        System.out.println(count);
        
    }

}
