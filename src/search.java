import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] numbers = {1,2,3,45,69,55,44};
//        int target ;
//        System.out.print("which number you want to search :");
//        target = sc.nextInt();
//        boolean isFound = false;
//        for (int i = 0; i < numbers.length; i++) {
//            if(target == numbers[i]){
//                isFound = true;
//                System.out.print("element found at " + i);
//
//            }
//        }
//         if(!isFound){
//             System.out.println("element not found ");
//         }
        String[] fruits = {"apple","orange", "banana"};
        String target;
        target = sc.next();
        boolean isFound = false;
        for(int i=0;i<fruits.length;i++){
            if(fruits[i].equals(target)){
                System.out.println("the fruits found at " + i);
                break;
            }
        }
        if(!isFound){
            System.out.println("element not found ");
        }

    }
}
