package chap_04;

public class _05_For {
    public static void main(String[] args) {
//        반복문 For (선언, 조건, 증감)
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
        }
//        짝수만 출력
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
//        합 (1~10)
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
