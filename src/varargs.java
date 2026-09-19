public class varargs {
    public static void main(String[] args) {
        System.out.println(average());
    }
//    static int add(int... numbers ){
//        int sum = 0;
//
//        for(int i = 0;i<numbers.length;i++){
//            sum = sum + numbers[i];
//        }
//        return sum;
//    }
    static  double average(double... num){
        double sum = 0;
        if(num.length == 0){
            return 0;
        }
     for(double number:num){
         sum+=number;
     }
        return sum/num.length;

    }
}
