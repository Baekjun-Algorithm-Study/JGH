package study.week04;

import java.util.Scanner;

public class P2566 {
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int[][] array = new int[9][9];
	    
	    int max = 0;
	    int x = 0;
	    int y = 0;
	    
	    for(int i = 0; i < array.length; i++) {
	    	for( int j = 0; j < array[i].length; j++) {
	    		array[i][j] = sc.nextInt();
	    		if(array[i][j] >= max) {
	    			max = array[i][j];
	    			x = i + 1;
	    			y = j + 1;
	    		}
	    	}
	    		
	    }
	    
	    System.out.println(max);
	    System.out.println(x + " " + y);
	
	}

}
