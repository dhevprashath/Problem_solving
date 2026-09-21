class Dog{
    void speak(){
        System.out.println("dag barks");
    }
}
//class TalkingDog extends Dog{
//    @Override
//    void speak(){
//        System.out.println("Scooby doo speaks english");
//    }
//}

public class ananomousClass {
    static void main() {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak() {
                System.out.println("scooby doo speaks english");
            }
        };

        dog1.speak();
        dog2.speak();


    }
}
