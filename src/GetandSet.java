class Cars {
    String name;
    String color;
    int price;

    Cars(String name,String color,int price){
        this.name = name;
        this.color = color;
        this.price = price;
    }
}

public class GetandSet {
    public static void main(String[] args) {
       Cars car = new Cars("ford","mustang",600000);
        System.out.println(car.name);

    }
}
