package study.week11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P2581 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = Math.max(m, 2); i <= n; i++) {
        	
        	boolean isPirme = true;
        	
        	for(int j = 2; j < i; j++) {
        		if(i % j == 0) {
        			isPirme = false;
        			break;
        		}
        	}
        	if(isPirme) {
    			list.add(i);
    		}
        }
        
        if(list.size() != 0) {
        	for(int i = 0; i < list.size(); i++) {
            	sum += list.get(i);
            }
        	
        	System.out.println(sum);
        	System.out.println(list.get(0));
        } else {
        	System.out.println(-1);
        }
        
    }

}
