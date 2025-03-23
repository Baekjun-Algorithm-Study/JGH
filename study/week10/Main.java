package study.week10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        while(true) {
        	
        	List<Integer> list = new ArrayList<Integer>();
            int result = 0;
        	
        	int n = sc.nextInt();
        	
        	if(n == -1) break;
        	
        	for (int i = 1; i < n; i++ ) {
        		if(n % i == 0){
                	list.add(i);
                	result += i; 
				}
        	}
        	
        	
        	if(n != result) {
        		System.out.println(n + " is NOT perfect.");
        		continue;
        	}
        	System.out.print(n + " = ");
        	for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                if (i < list.size() - 1) {  
                    System.out.print(" + ");
                }
            }
			System.out.println();
        	
        }
        
        
    }
}
