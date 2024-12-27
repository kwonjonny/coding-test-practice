package hash_solve;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 아나그램(해쉬)
 * 설명
 * <p>
 * Anagram 이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
 * <p>
 * 예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
 * <p>
 * 알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
 * <p>
 * 길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.
 * <p>
 * 입력
 * 첫 줄에 첫 번째 단어가 입력되고, 두 번째 줄에 두 번째 단어가 입력됩니다.
 * 단어의 길이는 100을 넘지 않습니다.
 * <p>
 * 출력
 * 두 단어가 아나그램이면 “YES"를 출력하고, 아니면 ”NO"를 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
     AbaAeCe
     baeeACA
 * <p>
 * 예시 출력 1
     YES
 * <p>
 * <p>
 * 예시 입력 2
     abaCC
     Caaab
 * <p>
 * 예시 출력 2
 *   NO
 */
public class A2_Hash {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        String firstStr = scan.next();
        String secondStr = scan.next();
        String str = solution(firstStr, secondStr);
        System.out.println(str);
    }

    public static String solution(String firstStr, String secondStr) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(char c : firstStr.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for(char c : secondStr.toCharArray()) {
            if(!hashMap.containsKey(c) || hashMap.get(c) == 0) return "NO";
            hashMap.put(c, hashMap.get(c) - 1);
        }

        for(Map.Entry<Character, Integer> hash : hashMap.entrySet()) {
            if(hash.getValue() != 0) {
                return "NO";
            } else {
                return "YES";
            }
        }
        return "YES";
    }

    /**
     * 재 복습: 2024-12-26
     */
    public static class A2Hash1 {
        public static void main(String[] args) {
            A2Hash1 a2Hash1 = new A2Hash1();
            Scanner scan = new Scanner(System.in);
            String aStr = scan.next();
            String bStr = scan.next();
            String answer = a2Hash1.solution(aStr, bStr);
            System.out.println(answer);
        }
        public String solution(String aStr, String bStr) {
            HashMap<Character, Integer> aHashMap = new HashMap<>();

            for(Character x : aStr.toCharArray()) {
                aHashMap.put(x, aHashMap.getOrDefault(x, 0) + 1);
            }
            for(Character x : bStr.toCharArray()) {
                if(!aHashMap.containsKey(x) || aHashMap.get(x) == 0) return "NO";
                aHashMap.put(x, aHashMap.getOrDefault(x, 0) - 1);
            }

            for(Map.Entry<Character, Integer> map : aHashMap.entrySet()) {
                if(map.getValue() != 0) return "NO";
                return "YES";
            }
            return "YES";
        }
    }
}
