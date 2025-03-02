package java_알고리즘_문제풀이_입문_코딩테스트_대비.정렬_이분검색과_결정알고리즘;

/**
 * 7. 좌표 정렬
 * 설명
 * <p>
 * N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
 * <p>
 * 정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫째 줄에 좌표의 개수인 N(3<=N<=100,000)이 주어집니다.
 * <p>
 * 두 번째 줄부터 N개의 좌표가 x, y 순으로 주어집니다. x, y값은 양수만 입력됩니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * N개의 좌표를 정렬하여 출력하세요.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    5
    2 7
    1 3
    1 2
    2 5
    3 6
 * 예시 출력 1
 * <p>
 * 1 2
 * 1 3
 * 2 5
 * 2 7
 * 3 6
 */

import java.util.*;

public class G_좌표_정렬7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Point> answer = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            answer.add(new Point(x, y));
        }
        Collections.sort(answer);
        for (Point x : answer) {
            System.out.println(x.x + " " + x.y);
        }
    }
    public static class Point implements Comparable<Point> {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int compareTo(Point other) {
            if (this.x == other.x) return this.y - other.y;
            else return this.x - other.x;
        }
    }
}
