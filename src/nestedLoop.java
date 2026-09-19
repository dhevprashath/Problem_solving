import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        int column;
        char symbol;

        System.out.print("Enter the row of a matrix : ");
        row = sc.nextInt();

        System.out.print("Enter the column of the matrix : ");
        column =sc.nextInt();

        System.out.print("Enter the symbol : ");
        symbol = sc.next().charAt(0);


        for (int i = 0; i<row ; i++){
            for (int j = 0;j<column;j++){
                System.out.print(symbol);
            }
            System.out.println();
        }

        sc.close();
    }
}
