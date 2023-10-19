import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    // Билет № 13 (текст задачи в файле Task.txt)
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        User ivan = new User("Ivan", 30);
        User petr = new User("Petr", 25);
        User sidor = new User("Sidor", 32);
        User fedor = new User("Fedor", 40);

        Collection<User> userCollection = new ArrayList<>(List.of(
                ivan,
                petr,
                sidor,
                fedor,
                petr
        ));

        System.out.println(userCollection);

        System.out.println(userService.deleteDuplicate(userCollection));
        System.out.println(userService.sortByName(userCollection));
        System.out.println(userService.sortByAge(userCollection));
        System.out.println(userService.oldest(userCollection));
        System.out.println(userService.doAllTasks(userCollection));
    }
}