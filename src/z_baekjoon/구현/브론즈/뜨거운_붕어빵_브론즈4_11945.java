package z_baekjoon.구현.브론즈;

import java.io.*;

public class 뜨거운_붕어빵_브론즈4_11945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sizes = br.readLine().split(" ");
        int N = Integer.parseInt(sizes[0]);
        int T = Integer.parseInt(sizes[1]);
        if (N == 0 || T == 0) return;
        char[][] array = new char[N][T];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            array[i] = line.toCharArray();
        }
        solution(array, N, T);
    }
    public static void solution(char[][] array, int N, int T) {
        for (int i = 0; i < N; i++) {
            int p1 = 0;
            int p2 = T - 1;
            while (p1 < p2) {
                char temp = array[i][p1];
                array[i][p1] = array[i][p2];
                array[i][p2] = temp;
                p1++;
                p2--;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(array[i]);
        }
    }
}
