public class Main {
    public static void main(String[] args) {
        User user1 = new User.Builder("user1","123").build();
        System.out.println(user1.toString());
        User user2 = new User.Builder("Pavel","1746154124612498512416vhdgfsfds").fName("Karel").build();
        System.out.println(user2.toString());
        User user3 = new User.Builder("","").fName("").gender(true).build();
        System.out.println(user3.toString());
    }
}
