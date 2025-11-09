package do_it_알고리즘_코딩테스트_with_java.자료구조;

import java.util.*;

public class 백준_11720_숫자의_합_구하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String str = scan.next();
        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += Integer.valueOf(String.valueOf(str.charAt(i)));
        }
        System.out.println(sum);
    }


    public static class 백준_11720_숫자의_합_구하기_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            String str = scan.next();
            int sum = 0;
            for(char x : str.toCharArray()) {
                int y = x - '0';
                sum += y;
            }
            System.out.println(sum);
        }
    }
}
