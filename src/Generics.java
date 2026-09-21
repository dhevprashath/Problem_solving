class box<T>{
    T items;

    public void setItems(T items){
        this.items = items;
    }
    public T getItems(){
        return this.items;
    }
}

public class Generics {
    static void main() {
      box<String> b = new box<>();
      b.setItems("apple");
        System.out.println(b.getItems());

    }
}
