import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        char operation;
        double result = 0;
       boolean  validoperation = true;

        System.out.print("Enter the first number : ");
        num1 = sc.nextDouble();

        System.out.print("Enter the operation (+ - * / ^) : ");
        operation = sc.next().charAt(0);

        System.out.print("Enter the second number : ");
        num2 = sc.nextDouble();

         switch (operation){
             case '+' -> result = num1+num2;
             case '-' -> result = num1-num2;
             case '*' -> result = num1*num2;
             case '/' -> {
                 if (num2 == 0){
                     System.out.println("cant divide by zero");
                 }
                 else {
                     result = num1/num2;
                 }
             }
             case '^' -> result = Math.pow(num1,num2);
             default -> {
                 System.out.println("invalid operation");
                 validoperation = false;
             }
         }
         if (validoperation) {
             System.out.println(result);
         }
        sc.close();
    }
}
