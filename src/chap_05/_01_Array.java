package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        String[] coffees = { "아메리카노", "카페모카", "라떼", "카푸치노" };
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
    }
}