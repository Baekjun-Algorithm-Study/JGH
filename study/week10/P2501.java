package study.week10;

import java.util.Scanner;

public class P2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int n = 0;
        int result = 0;
        
        for(int i = 1; i <= a; i++){
        	if(a % i == 0){
            	n++;
            }
        	if(n == b) {
        		result = i;
        		break;
        	}
        }
        System.out.println(result);
        
    }

}
