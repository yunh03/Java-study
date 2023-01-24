package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int childHeight = 121;
        String status = (childHeight >= 120) ? "탑승 가능" : "탑승 불가능";
        System.out.println("키가 " + childHeight + "cm 이므로 " + status + "합니다");
    }
}
