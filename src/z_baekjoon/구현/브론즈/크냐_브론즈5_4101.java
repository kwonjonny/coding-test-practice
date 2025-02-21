package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 크냐_브론즈5_4101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            int first = scan.nextInt();
            int second = scan.nextInt();
            if(first == 0 && second == 0) break;
            String answer = first > second ? "Yes" : "No";
            System.out.println(answer);
        }
    }
}
