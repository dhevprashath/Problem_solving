class Animal{
    void eat (){
        System.out.println("eating");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
class inheritence{
    public static void main(String[] args) {
        dog mydog = new dog();
        mydog.eat();
        mydog.bark();
    }
}