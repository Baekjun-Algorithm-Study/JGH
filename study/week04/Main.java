package study.week04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[][] paper = new int[101][101];
        int extent = 0;
        
        for(int i = 0; i < count; i++) {
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	
        	for(int j = x; j < x + 10; j++) {
        		for(int k = y; k < y + 10; k++) {
        			paper[j][k] = 1;
        		}
        	}
        }
        
        for(int i = 0; i < 100; i++) {
        	for(int j = 0; j < 100; j++) {
        		if(paper[i][j] == 1) {
        			extent += 1;
        		}
        	}
        }

        System.out.println(extent);
        
    }
}
