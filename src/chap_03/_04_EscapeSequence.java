package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
//        특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");
//        \n 줄바꿈 (Enter)
        System.out.println("자바가\n너무\n재밌어요");
//        \t 탭 (Tab)
        System.out.println("해물파전\t\t9000원");
        System.out.println("김치전\t\t8000원");
        System.out.println("부추전\t\t8000원");
//        역슬래시 2번 (\ 그대로 출력)
        System.out.println("C:\\Program Files\\Java");
//        큰, 작은 따옴표
        System.out.println("단비가 \"냐옹\"이라고 했어요");
        System.out.println("단비가 \'냐옹\'이라고 했어요");
    }
}
