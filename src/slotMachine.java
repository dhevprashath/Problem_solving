    import java.util.Random;
    import java.util.Scanner;

    public class slotMachine {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int balance = 100;
            int bet;
            int payout;
            String[] row;
            String playAgain;

            System.out.println("*************************");
            System.out.println(" welcome to the java slot ");
            System.out.println("Symbols : 🔥 🐦‍🔥 ❤️ 👊 🦋");
            System.out.println("*************************");

            while (balance>0){
                System.out.println("your current balance Amount is : " + balance);
                System.out.print("Enter your Bet Amount : ");
                bet = sc.nextInt();
                sc.nextLine();

                if(bet>balance){
                    System.out.println("insufficient Money");
                    continue;
                }
                else if (bet<=0) {
                    System.out.println("Bet Must be greater than zero ");
                    continue;
                }
                else{
                    balance-=bet;

                }
                System.out.println("Spinning......");
               row =  spinRow();
               printRow(row);
              payout =  getPayout(row,bet);

              if(payout > 0){
                  System.out.println("you won $ : " + payout);
                  balance += payout;
              }
              else {
                  System.out.println("sorry you lost ");
              }
                System.out.print("Do you want play Again(Y/N): ");
               playAgain = sc.nextLine().toUpperCase();

                if(!playAgain.equals("Y")){
                    break;
                }
            }

            System.out.println("Game Over final balance is :  " + balance);
            sc.close();
        }
        static String[] spinRow(){
            String[] symbols = {"🔥", "🐦‍🔥", "❤️", "👊", "🦋"};
            String[] row = new String[3];
            Random random = new Random();

            for (int i = 0;i<3;i++){
                row[i] =  symbols[random.nextInt(symbols.length)];
            }
            return row;
        }
        static void printRow(String[] row){
            System.out.println("******************");
            System.out.println(" " + String.join(" | ",row));
            System.out.println("******************");
        }
        static int getPayout(String[] row, int bet) {

            if (row[0].equals(row[1])) {
                return switch (row[0]) {
                    case "🔥" -> bet * 3;
                    case "🐦‍🔥" -> bet * 4;
                    case "❤️" -> bet * 5;
                    case "👊" -> bet * 10;
                    case "🦋" -> bet * 20;
                    default -> 0;
                };

            } else if (row[1].equals(row[2])) {
                return switch (row[1]) {
                    case "🔥" -> bet * 2;
                    case "🐦‍🔥" -> bet * 3;
                    case "❤️" -> bet * 4;
                    case "👊" -> bet * 9;
                    case "🦋" -> bet * 10;
                    default -> 0;
                };
            }

            return 0;
        }
        }

