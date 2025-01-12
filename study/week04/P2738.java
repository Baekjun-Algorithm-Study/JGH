package study.week04;

import java.util.Scanner;

public class P2738 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    
	    int[][] array = new int[x][y];
	    int[][] array2 = new int[x][y];
	    
	    int[][] result = new int[x][y];
	    
	    for(int i = 0; i < x; i++) {
	    	for(int j = 0; j < y; j++) {
	    		array[i][j] = sc.nextInt();
	    	}
	    }
	    for(int i = 0; i < x; i++) {
	    	for(int j = 0; j < y; j++) {
	    		array2[i][j] = sc.nextInt();
	    	}
	    }
	    
	    for (int i = 0; i < x; i++) {
	        for (int j = 0; j < y; j++) {
	            result[i][j] = array[i][j] + array2[i][j];
	        }
	    }
	    for (int i = 0; i < x; i++) {
	        for (int j = 0; j < y; j++) {
	            System.out.print(result[i][j] + " ");
	        }
	        System.out.println();
	    }

	    sc.close();
	    
	    }

}
