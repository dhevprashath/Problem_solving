public class Person {
    String first;
    String last;

    Person(String first , String last){
        this.first = first;
        this.last = last;
    }
    static class Student extends Person{
        double gpa;
        Student(String first , String last , double gpa){
            super(first,last);
            this.gpa = gpa;
        }
        void showGpa(){
            System.out.println(this.first + " gpa is : " + this.gpa);
        }
    }
    void showName(){
        System.out.println(this.first + " " + this.last);
    }

    public static void main(String[] args) {
        Person person = new Person("dhev" , "prashath");
        Student student = new Student("kokki" , "kumaru",8.5);
        student.showName();
        student.showGpa();

    }
}
