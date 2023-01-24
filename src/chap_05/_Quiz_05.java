package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        String[] size = new String[10];
        int j = 250;
        for (int i = 0; i < size.length; i++) {
            size[i] = String.valueOf(j);
            System.out.println("사이즈 " + size[i] + " (재고 있음)");
            j += 5;
        }
    }
}
