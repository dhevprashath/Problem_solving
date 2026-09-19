public class Car {

    String name = "toyato";
    String model = "Taizor";
    int year = 2025;
    boolean isRunning = false;

    public Car(String ford, String mustang, int i) {
    }

    void start(){
        isRunning = true;
        System.out.println("you start the Engine ");
    }
    void stop(){
        isRunning = false;
        System.out.println("you stop the engine ");
    }
    void drive(){
        System.out.println("you drive the " + model);
    }
    void brake(){
        System.out.println("you brake the " + model);
    }
}
