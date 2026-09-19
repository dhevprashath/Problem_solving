public class methods {
    public static void main(String[] args) {

       double result  =  square(5);
       double cubeResult = cube(4);
        System.out.println(cubeResult);
    }
    static void happybirthday (String name , int age){
        System.out.println("Happy Birthday to you ");
        System.out.println("Happy Birthday dear " + name);
        System.out.println("Happy Birthday to your mom");
        System.out.println("Happy Birthday you are " + age + " yr old");
    }
    static double square(double number ) {
        return number * number;
    }
      static double cube (double number ){
           return number*number*number;

        }
    }

