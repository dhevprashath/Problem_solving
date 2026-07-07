import java.util.Random;
import java.util.Scanner;

public class randomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner((System.in));
        int guess = 0;
        int attempts = 0;
        int min = 1;
        int max = 100;

        int randomNUmber = random.nextInt(min,max + 1);

        System.out.println("welcome to number guessing game ");
        System.out.printf("Guess the number between %d - %d\n ",min,max);


        do {
            System.out.print("Take a guess : ");
             guess = sc.nextInt();
             attempts++;

            if (guess > randomNUmber ){
                System.out.println(" Too high");

            } else if (guess< randomNUmber) {
                System.out.println("Too low ");
            }
            else {
                System.out.println("you won the game the number is : " + randomNUmber);
                System.out.println("# the Number of attempts is : " + attempts);
            }

        }while (guess != randomNUmber);

         sc.close();

    }
}
