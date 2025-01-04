package study.week02;

import java.util.Scanner;

public class P1152 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        String st = scanner.nextLine();
        
        st = st.trim();
        String[] stAr = st.split(" ");
        
        if(stAr[0].equals("")) {
        	System.out.println(0);
        } else {
        	System.out.println(stAr.length);
        }
        
       
	}

}
