package chap_06;

public class _02_Parameter {
    public static void power(int num) {
        int result = num * num;
        System.out.println(num + "의 제곱은 " + result);
    }

    public static void powerByExp(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        System.out.println(num + "의 " + exp + "제곱은 " + result);
    }
    public static void main(String[] args) {
        power(3);
        powerByExp(2, 0);
    }
}
