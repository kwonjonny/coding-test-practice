package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 세로읽기_브론즈1_10798 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] array = new char[5][15];

        for(int i = 0; i < 5; i++) {
            String str = scan.next();
            for(int j = 0; j < str.length(); j++) {
                array[i][j] = str.charAt(j);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 15;i ++) {
            for(int j = 0; j < 5; j++) {
                if(array[j][i] != '\0') stringBuilder.append(array[j][i]);
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
