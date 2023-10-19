import java.util.Collection;
import java.util.Comparator;

public class UserServiceImpl implements UserService{
    @Override
    public Collection<User> deleteDuplicate(Collection<User> userCollection) {
        return userCollection.stream()
                .distinct()
                .toList();
    }
    @Override
    public Collection<User> sortByName(Collection<User> userCollection) {
        return userCollection.stream()
                .sorted(Comparator.comparing(User::getName))
                .toList();
    }
    @Override
    public Collection<User> sortByAge(Collection<User> userCollection) {
        return userCollection.stream()
                .sorted(Comparator.comparing(User::getAge))
                .toList();
    }
    @Override
    public User oldest(Collection<User> userCollection) {
        return userCollection.stream()
                .sorted(Comparator.comparing(User::getAge).reversed())
                .toList()
                .stream()
                .findFirst()
                .get();
    }
    @Override
    public User doAllTasks(Collection<User> userCollection) {
        return userCollection.stream()
                .distinct()
                .sorted(Comparator.comparing(User::getName))
                .sorted(Comparator.comparing(User::getAge).reversed())
                .toList()
                .stream()
                .findFirst()
                .get();
    }

}
