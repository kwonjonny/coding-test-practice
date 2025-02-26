package 알고리즘.큰돌의터전.일주차;

import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextInt()) {
            int N = scan.nextInt();
            int cnt = 1, ret = 1;

            while(true) {
                if(cnt % N == 0) {
                    System.out.println(ret);
                    break;
                }
                else {
                    cnt = (cnt * 10 + 1) % N;
                    ret++;
                }
            }
        }
    }
}
