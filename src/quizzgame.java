import java.util.Scanner;

public class quizzgame {
    public static void main(String[] args) {
        String[] questions = {"what is java? ",
                "what is cpp?",
                "what is python ?",
                "uses of react ",
                "uses of springBoot "};

        String[][] options = {{"1. it is a programming language", "2. its a game", "3. it is a movie", "4.its coffee seed "},
                {"1.its copy option", "2. its upgrade version of c", "3. its a controll panel", "4useless "},
                {"1. used for video editing", "2. high level language", "3. malai paambu", "4. i dont use python "},
                {"1. used of expression", "2. telling without answer", "3.used for web dev", "4. unkown "},
                {"1. extension", "2. boat", "used in river", "4.java backend development"}};

        int[] answers = {1, 2, 2, 3, 4};
        int score = 0;
        int guess;
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("welcome to the java quizz game : ");
        System.out.println("--------------------------------");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
                }
            System.out.print("Take a Guess : ");
            guess = sc.nextInt();

            if(guess == answers[i]) {
                System.out.println("-----------");
                System.out.println("CORRECT!!");
                System.out.println("-----------");
                score++;
            }
                else {
                    System.out.println("-----------");
                    System.out.println("WRONG ANSWER!!");
                    System.out.println("-----------");
            }
        }
        System.out.println("your Final Score is " + score + " out of " + questions.length);


      sc.close();
    }
}

