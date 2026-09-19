import java.util.Scanner;

class star{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star;
        System.out.print(" Enter a number to print a Star!! : ");
        star = sc.nextInt();

        for(int i = 1; i<=star; i++){
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}