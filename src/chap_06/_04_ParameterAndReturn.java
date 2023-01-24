package chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int num) {
        int result = num * num;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(getPower(2));
    }
}