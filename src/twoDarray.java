public class twoDarray {
    public static void main(String[] args) {
//        String[] fruits = {"apple","banana","grapes"};
//        String[] vegetables = {"brinjal","potatoe","carrot"};
//        String[] meat = {"chick","beef","mutton"};
//
////        String[][] groceries = {fruits,vegetables,meat};
////
////        for(String[] foods:groceries){
////            for(String food:foods){
////                System.out.print(food + " ");
////            }
////            System.out.println();

        char[][] telephone = {{'1','2','3'},
                             {'4','5','6'},
                             {'7','8','9'},
                              {'*','0','#'}};

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }


    }
}
