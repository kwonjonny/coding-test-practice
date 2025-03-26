package z_baekjoon.구현.브론즈;

import java.util.*;

public class 학점계산_브론즈3_2754 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        solution(str);
    }
    public static void solution(String str) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("A+", 4.3);
        map.put("A0", 4.0);
        map.put("A-", 3.7);
        map.put("B+", 3.3);
        map.put("B0", 3.0);
        map.put("B-", 2.7);
        map.put("C+", 2.3);
        map.put("C0", 2.0);
        map.put("C-", 1.7);
        map.put("D+", 1.3);
        map.put("D0", 1.0);
        map.put("D-", 0.7);
        map.put("F", 0.0);
        for(Map.Entry<String, Double> set : map.entrySet()) {
            if(set.getKey().equals(str)) {
                System.out.println(set.getValue());
            }
        }
    }
}
