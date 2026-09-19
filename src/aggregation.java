class Book{
      String titles;
      int pages;

      Book(String titles , int pages){
          this.titles = titles;
          this.pages = pages;
      }
      String displayInfo(){
          return this.titles + " " + "$"+pages;
    }
}
class Library{

}
public class aggregation {
    static void main() {
        Book book1 = new Book("rich dad poor dad" , 500);
        Book book2 = new Book("the alchamist" , 543);
        Book book3 = new Book("hey Ram" , 690);

        Book[] book = {book1,book2,book3};
        System.out.println(book1.displayInfo());
    }
}
