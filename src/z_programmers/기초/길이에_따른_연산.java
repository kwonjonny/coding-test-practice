package z_programmers.기초;

public class 길이에_따른_연산 {
    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int answer = solution(numList);
        System.out.println(answer);
    }
    public static int solution(int[] numList) {
        if(numList.length >= 11) {
            int answer = 0;
            for (int j : numList) {
                answer += j;
            }
            return answer;
        } else {
            int answer = 1;
            for (int j : numList) {
                answer *= j;
            }
            return answer;
        }
    }
}
