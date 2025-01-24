package queue_solve;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 응급실
 * 설명
 *
 * 메디컬 병원 응급실에는 의사가 한 명밖에 없습니다.
 *
 * 응급실은 환자가 도착한 순서대로 진료를 합니다. 하지만 위험도가 높은 환자는 빨리 응급조치를 의사가 해야 합니다.
 *
 * 이런 문제를 보완하기 위해 응급실은 다음과 같은 방법으로 환자의 진료순서를 정합니다.
 *
 * • 환자가 접수한 순서대로의 목록에서 제일 앞에 있는 환자목록을 꺼냅니다.
 *
 * • 나머지 대기 목록에서 꺼낸 환자 보다 위험도가 높은 환자가 존재하면 대기목록 제일 뒤로 다시 넣습니다. 그렇지 않으면 진료를 받습니다.
 *
 * 즉 대기목록에 자기 보다 위험도가 높은 환자가 없을 때 자신이 진료를 받는 구조입니다.
 *
 * 현재 N명의 환자가 대기목록에 있습니다.
 *
 * N명의 대기목록 순서의 환자 위험도가 주어지면, 대기목록상의 M번째 환자는 몇 번째로 진료를 받는지 출력하는 프로그램을 작성하세요.
 *
 * 대기목록상의 M번째는 대기목록의 제일 처음 환자를 0번째로 간주하여 표현한 것입니다.
 *
 * 입력
 *
 * 첫 줄에 자연수 N(5<=N<=100)과 M(0<=M<N) 주어집니다.
 *
 * 두 번째 줄에 접수한 순서대로 환자의 위험도(50<=위험도<=100)가 주어집니다.
 *
 * 위험도는 값이 높을 수록 더 위험하다는 뜻입니다. 같은 값의 위험도가 존재할 수 있습니다.
 *
 *
 * 출력
 * M번째 환자의 몇 번째로 진료받는지 출력하세요.
 *
 *
 * 예시 입력 1
    5 2
    60 50 70 80 90
 *
 * 예시 출력 1
 * 3
 *
 * 예시 입력 2
     6 3
     70 60 90 60 60 60
 *
 * 예시 출력 2
 * 4
 */
public class A3_Queue {

    public static class A3Queue5 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer target = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            A3Queue5.solution(length, target, intArray);
        }
        public static class Person5 {
            private Integer id;
            private Integer price;
            public Person5(Integer id, Integer price) {
                this.id = id;
                this.price = price;
            }
        }
        public static void solution(Integer length, Integer target, Integer[] intArray) {
            Queue<Person5> queue = new LinkedList<>();
            for(int i = 0; i < length; i++) {
                queue.offer(new Person5(i, intArray[i]));
            }
            int answer = 0;
            while(!queue.isEmpty()) {
                Person5 temp = queue.poll();
                for(Person5 x : queue) {
                    if(temp.price > x.price) {
                        queue.offer(temp);
                        temp = null;
                        break;
                    }
                }
                if(temp != null) {
                    answer++;
                    if(target.equals(temp.id)) System.out.println(answer);
                }
            }
        }
    }

    /**
     * 재 복습: 2025-01-14
     */
    public static class A3Queue4 {
        public static void main(String[] args) {
            A3Queue4 a3Queue4 = new A3Queue4();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer order = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            a3Queue4.solution(length, order, intArray);
        }
        public void solution(Integer length, Integer order, Integer[] intArray) {
            Queue<Person4> queue = new LinkedList<>();
            for(int i = 0; i < length; i++) {
                queue.offer(new Person4(i, intArray[i]));
            }
            int answer = 0;
            while(!queue.isEmpty()) {
                Person4 temp = queue.poll();
                for(Person4 x : queue) {
                    if(x.order > temp.order) {
                        queue.offer(temp);
                        temp = null;
                        break;
                    }
                }
                if(temp != null) {
                    answer++;
                    if(order.equals(temp.getId())) System.out.println(answer);
                }
            }
        }
        public static class Person4 {
            private Integer id;
            private Integer order;
            public Person4(Integer id, Integer order) {
                this.id = id;
                this.order = order;
            }
            public Integer getId() {
                return id;
            }
            public Integer getOrder() {
                return order;
            }
        }
    }


    /**
     * 재 복습: 2025-01-13
     */
    public static class A3Queue3 {
        public void solution(Integer length, Integer order, Integer[] intArray) {
            Queue<Person3> queue = new LinkedList<>();
            for(int i = 0; i < length; i++) {
                queue.offer(new Person3(i, intArray[i]));
            }
            int answer = 0;
            while(!queue.isEmpty()) {
                Person3 temp = queue.poll();
                for(Person3 x : queue) {
                    if(x.getOrder() > temp.getOrder()) {
                        queue.offer(temp);
                        temp = null;
                        break;
                    }
                }
                if(temp != null) {
                    answer++;
                    if(temp.getId().equals(order)) System.out.println(answer);
                }
            }
        }
        public static class Person3 {
            private Integer id;
            private Integer order;
            public Person3(Integer id, Integer order) {
                this.id = id;
                this.order = order;
            }
            public Integer getId() {
                return id;
            }
            public Integer getOrder() {
                return order;
            }
        }
        public static void main(String[] args) {
            A3Queue3 a3Queue3 = new A3Queue3();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer order = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            a3Queue3.solution(length, order, intArray);
        }
    }

    /**
     * 재 복습: 2025-01-10
     */
    public static class A4Queue {
        public static void main(String[] args) {
            A4Queue a4Queue = new A4Queue();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer order = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            a4Queue.solution(length, order, intArray);
        }
        public void solution(Integer length, Integer order, Integer[] intArray) {
            Queue<Person3> queue = new LinkedList<>();
            for(int i = 0; i < length; i++) {
                queue.offer(new Person3(i, intArray[i]));
            }

            int answer = 0;
            while(!queue.isEmpty()) {
                Person3 temp = queue.poll();
                for(Person3 x : queue) {
                    if(x.order > temp.order) {
                        queue.offer(temp);
                        temp = null;
                        break;
                    }
                }
                if(temp != null) {
                    answer++;
                    if(order.equals(temp.id)) System.out.println(answer);
                }
            }
        }
        public static class Person3 {
            private Integer id;
            private Integer order;
            public Person3(Integer id, Integer order) {
                this.id = id;
                this.order = order;
            }
        }
    }

    /**
     * 재 복습: 2025-01-10
     */
    public static class A3Queue2 {
        public static void main(String[] args) {
            A3Queue2 a3Queue2 = new A3Queue2();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer order = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            a3Queue2.solution(length, order, intArray);
        }
        public void solution(Integer length, Integer order, Integer[] intArray) {
            Queue<Person2> queue = new LinkedList<>();
            for(int i = 0; i < length; i++) {
                queue.offer(new Person2(i, intArray[i]));
            }
            int answer = 0;
            while(!queue.isEmpty()) {
                Person2 temp = queue.poll();
                for(Person2 Q : queue) {
                    if(temp.order < Q.order) {
                        queue.offer(temp);
                        temp = null;
                        break;
                    }
                }
                if(temp != null) {
                    answer++;
                    if(order.equals(temp.id)) {
                        System.out.println(answer);
                    }
                }
            }
        }
        public static class Person2 {
            private Integer id;
            private Integer order;
            public Person2(Integer id, Integer order) {
                this.id = id;
                this.order = order;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer length = scan.nextInt();
        Integer count = scan.nextInt();
        Integer[] intArray = new Integer[length];
        for(int i = 0; i < length; i++) {
            intArray[i] = scan.nextInt();
        }
        Integer answer = solution(length, count, intArray);
        System.out.println(answer);
    }
    public static class Person {
        Integer id;
        Integer order;
        public Person(Integer id, Integer order) {
            this.id = id;
            this.order = order;
        }
    }
    public static Integer solution(Integer length, Integer orderCount, Integer[] intArray) {
        Integer answer = 0;
        Queue<Person> personQueue = new LinkedList<>();
        for(int i = 0; i < length; i++) {
            personQueue.offer(new Person(i, intArray[i]));
        }
        while(!personQueue.isEmpty()) {
            Person temp = personQueue.poll();
            for(Person x : personQueue) {
                if(x.order > temp.order) {
                    personQueue.offer(temp);
                    temp = null;
                    break;
                }
            }
            if(temp != null) {
                answer++;
                if(orderCount.equals(temp.id)) return answer;
            }
        }
        return answer;
    }

    /**
     * 재 복습: 2025-01-02
     */
    public static class A3Queue {
        public static void main(String[] args) {
            A3Queue a3Queue = new A3Queue();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer orderCount = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            System.out.println(a3Queue.solution(length, orderCount, intArray));
        }
        public Integer solution(Integer length, Integer orderCount, Integer[] intArray){
            int answer = 0;
            Queue<Person1> personQueue = new LinkedList<>();
            for(int i = 0; i < length; i++) {
                personQueue.offer(new Person1(i, intArray[i]));
            }
            while(!personQueue.isEmpty()) {
                Person1 temp = personQueue.poll();
                for(Person1 x : personQueue) {
                    if(x.id > temp.id) {
                        personQueue.offer(temp);
                        temp = null;
                        break;
                    }
                }
                if(temp != null) {
                    answer++;
                    if(orderCount.equals(temp.id)) return answer;
                }
            }
            return answer;
        }
        public static class Person1 {
            Integer id;
            Integer order;
            public Person1(Integer id, Integer order) {
                this.id = id;
                this.order = order;
            }
        }
    }
}
