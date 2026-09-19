public class fish implements prey,predator{
 @Override
    public void flee(){
     System.out.println("fish is escaping");

 }
    @Override
    public void hunt() {
        System.out.println("fish is getting");
    }
}
