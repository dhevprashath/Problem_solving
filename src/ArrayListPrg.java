    import java.util.ArrayList;
    import java.util.*;

    public class ArrayListPrg {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            ArrayList<String> fruits = new ArrayList<>();


            System.out.print("enter the # of fruits :");
            int numOfFruits = sc.nextInt();
            sc.nextLine();

            for(int i = 1;i<=numOfFruits;i++){
                System.out.print("enter the # of fruits : " + i  + ": ");
                String fruit = sc.nextLine();
                fruits.add(fruit);
            }
            System.out.println(fruits);


            sc.close();
        }
    }
