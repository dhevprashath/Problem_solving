import java.util.HashMap;

public class HashMapDemo {
    static void main() {
        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 10.0);
        map.put("banana", 5.55);
        map.put("orange", 15.2);

//        if(map.containsKey("apple")){
//            System.out.println(map.get("apple"));
//        }
//        else{
//            System.out.println("there no key ");
//        }

        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }


    }
}
