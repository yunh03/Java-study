package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;
        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true, true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 true, true

    }
}
