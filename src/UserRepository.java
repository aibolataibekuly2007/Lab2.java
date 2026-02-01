public class UserRepository {
    public void saveToDatabase(User user) {
        System.out.println("Saving user to database: " + user.getName());
    }
}