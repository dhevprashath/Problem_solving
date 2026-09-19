public class practice {
    public static void main(String[] args) {
        int a = 2;
        System.out.println(a);
        int b = 3;
        System.out.println(b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
