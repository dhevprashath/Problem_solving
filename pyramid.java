import java.util.Scanner;

class pyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();
        int max = a;
         if(b>max){
            max=b;
         }
         if(c>max){
            max=c;
         }
         System.out.println(max);

    }
}