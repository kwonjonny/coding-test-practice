package z_programmers.입문;

import java.util.Scanner;

public class 각도기 {
    public static void solution(int angle) {
        if (0 < angle && angle > 90) System.out.println(1);
        else if (90 == angle) System.out.println(2);
        else if (90 < angle && angle > 180) System.out.println(3);
        else if (180 == angle) System.out.println(4);
    }
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int angle = scan.nextInt();
        solution(angle);
    }
}
