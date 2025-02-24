package z_baekjoon.구현.브론즈;

import java.util.Scanner;

public class 럭비_클럽_브론즈4_2083 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            String str = scan.nextLine();
            if(str.equals("# 0 0")) break;
            String[] splitArray = str.split(" ");
            String name = splitArray[0];
            int age = Integer.parseInt(splitArray[1]);
            int weight = Integer.parseInt(splitArray[2]);
            String answer = "";
            String result = (age > 17 || weight >= 80) ? "Senior" : "Junior";
            System.out.println(name + " " + result);
        }
    }
}
