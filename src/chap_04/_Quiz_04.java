package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int time = 5;
//        일반 차량: 1, 경차, 장애인: 2
        int vehicle = 2;
        int price = time * 4000;
        if(price >= 30000) {
            price = 30000;
        } else if(vehicle == 1) {
            System.out.println("주차 요금은 " + price + "원입니다.");
        } else {
            System.out.println("주차 요금은 " + (price / 2) + "원입니다.");
        }
    }
}
