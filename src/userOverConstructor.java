public class userOverConstructor {
    public static void main(String[] args) {
        User user1 = new User("dhev" );
        User user2 = new User("batman","batman@gmail.com");

        System.out.println(user2.username);
        System.out.println(user2.email);
    }
}
