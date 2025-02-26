package 알고리즘.큰돌의터전.일주차;

import java.util.*;

public class J1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        while(true) {
            Map<String, Integer> map = new HashMap<>();
            int K = scan.nextInt();
            for(int i = 0; i < K; i++) {
                scan.next();
                String str = scan.next();
                map.put(str, map.getOrDefault(str, 0) + 1);
            }

            int answer = 1;
            for(Map.Entry<String, Integer> entrySet : map.entrySet()) {
                answer = answer * (entrySet.getValue() + 1);
            }
            answer--;
            System.out.println(answer);

            N--;
            if(N == 0) break;

        }
    }
}
