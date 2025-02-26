package z_baekjoon.구현.브론즈;

import java.util.*;

public class 그룹_단어_체커_실버5_1316 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int answer = 0;
        for(int i = 0; i < N; i++) {
            String str = scan.next();
            if(solution(str)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
    public static boolean solution(String str) {
        boolean[] visit = new boolean[26];
        char prev = ' ';
        for(char x : str.toCharArray()) {
            if(prev != x) {
                if(visit[x - 'a']) return false;
                visit[x - 'a'] = true;
            }
            prev = x;
        }
        return true;
    }
}
