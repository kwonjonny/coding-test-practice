package 알고리즘.큰돌의터전.일주차;

import java.util.*;

public class L1_재귀풀이 {

    static int cnt = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        ArrayList<Integer> v = new ArrayList<>();
        combi(-1, v, a, n, m);

        System.out.println(cnt);
    }

    // 재귀적으로 두 개의 인덱스를 선택하여 합을 체크
    public static void combi(int idx, ArrayList<Integer> v, int[] a, int n, int m) {
        if (v.size() == 2) {
            int b = a[v.get(0)];
            int c = a[v.get(1)];
            if (b + c == m) {
                cnt++;
            }
            return;
        }
        for (int i = idx + 1; i < n; i++) {
            v.add(i);
            combi(i, v, a, n , m);
            v.remove(v.size() - 1);
        }
    }

    /**
     * 재 복습: 2025-02-25
     */
    public static class L12 {
        static int answer = 0;
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int L = scan.nextInt();
            int T = scan.nextInt();
            int[] array = new int[L];
            for(int i = 0; i < L; i++) {
                array[i] = scan.nextInt();
            }
            List<Integer> list = new ArrayList<>();
            combination(-1, list, L, T, array);
            System.out.println(answer);
        }
        public static void combination(int idx, List<Integer> list, int L, int T, int[] array) {
            if(list.size() == 2) {
                int a = array[list.get(0)];
                int b = array[list.get(1)];
                if(a + b == T) answer++;
                return;
            }
            for(int i = idx + 1; i < L; i++) {
                list.add(i);
                combination(i, list, L, T, array);
                list.remove(list.size() - 1);
            }
        }
    }
}
