package study.week01;

import java.util.Scanner;

public class P10807 {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	int count = 0;
    	int N = scanner.nextInt();
        int [] arr1 = new int[N];
        
        for (int i = 0; i < arr1.length; i++) {
			
			arr1[i] = scanner.nextInt();
		}
        
        int v = scanner.nextInt();
        
        for(int j = 0; j < arr1.length; j++){ 
            if(v == arr1[j]){
                count++;
            }
        }
        System.out.println(count);
        
        
    }

}
