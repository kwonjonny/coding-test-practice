package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 모음의_개수_브론즈4_1264 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            int answer = 0;
            String str = scan.nextLine();
            if(str.equals("#")) break;
            for(char x : str.toCharArray()) {
                if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }
}
