package study.week02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String st = scanner.next();
        int time = 0;

        for (int i = 0; i < st.length(); i++) {
            char currentChar = st.charAt(i);

            if ('A' <= currentChar && currentChar <= 'C') {
                time += 3;
            } else if ('D' <= currentChar && currentChar <= 'F') {
                time += 4;
            } else if ('G' <= currentChar && currentChar <= 'I') {
                time += 5;
            } else if ('J' <= currentChar && currentChar <= 'L') {
                time += 6;
            } else if ('M' <= currentChar && currentChar <= 'O') {
                time += 7;
            } else if ('P' <= currentChar && currentChar <= 'S') {
                time += 8;
            } else if ('T' <= currentChar && currentChar <= 'V') {
                time += 9;
            } else if ('W' <= currentChar && currentChar <= 'Z') {
                time += 10;
            }
        }

        System.out.println(time);

        scanner.close();
    }
}
