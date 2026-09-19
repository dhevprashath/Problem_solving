public class hunt{
    public static void main(String[] args){
      rabbit rab = new rabbit();
      hawk h = new hawk();
      fish fi = new fish();
      h.hunt();
      rab.flee();
      fi.flee();
      fi.hunt();

    }
}