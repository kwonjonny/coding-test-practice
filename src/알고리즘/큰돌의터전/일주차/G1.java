package 알고리즘.큰돌의터전.일주차;

import java.util.*;

public class G1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] array = new String[N + 1];
        for(int i = 0; i < N +1; i++) {
            String x = scan.next();
            array[i] = x;
        }

        String[] suffixPrefix = array[0].split("\\*");
        String prefix = suffixPrefix[0];
        String suffix = suffixPrefix[1];
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 1; i < array.length; i++) {
            String x = array[i];
            if(x.length() < suffix.length() + prefix.length()) {
                stringBuilder.append("NE").append("\n");
            }
            else if(x.startsWith(prefix) && x.endsWith(suffix)) {
                stringBuilder.append("DA").append("\n");
            }
            else stringBuilder.append("NE").append("\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
