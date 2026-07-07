public class nestedif {
    public static void main(String[] args) {
        boolean isstudent = false;
        boolean issenior = false;
        double price = 9.99;
        if(isstudent){
            if(issenior){
                System.out.println("you got the senior discount 20%");
                System.out.println("you got a Student discount 10% ");
                price*=0.7;
            }
            else {
                System.out.println("you got a Student discount 10% ");
                price *= 0.9;

            }

        }
        else{
            if (issenior){
                System.out.println("you got the senior discount 20% ");
                price*=0.8;
            }
            price = price * 1;

        }
        System.out.printf("the price of a currency is $%.2f",price);
    }
}
