public class overloadMethod {
    public static void main(String[] args) {
String pizza  = bakePizza ("flatPizza" , "maccroni");
        System.out.println(pizza);
    }
static String bakePizza (String bread){
        return bread +  " ";
    }
    static String bakePizza (String bread,String maccroni){
        return maccroni + " " + bread +  " ";
    }
}
