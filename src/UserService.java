import java.util.Collection;

public interface UserService {
    Collection<User> deleteDuplicate(Collection<User> userCollection);

    Collection<User> sortByName(Collection<User> userCollection);

    Collection<User> sortByAge(Collection<User> userCollection);

    User oldest(Collection<User> userCollection);

    User doAllTasks(Collection<User> userCollection);
}
