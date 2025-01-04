package study.week02;

import java.util.Scanner;

public class P10809 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arr = new int[26];
        
        for(int i = 0; i < arr.length; i++) {
        	 arr[i] =  -1;
        }
        
        String st = scanner.next();
        
        for(int i = 0; i < st.length(); i++) {
       	 	char ch = st.charAt(i);
       	 	
       	 	if(arr[ch - 'a'] == -1) {
       	 		arr[ch - 'a'] = i;
       	 	}
       }
        for(int i = 0; i < arr.length; i++) {
       	 	System.out.print(arr[i] + " ");
       }
        scanner.close();
         
	}
}
