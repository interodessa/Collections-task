package app;
import java.util.Arrays;
import java.util.List;
public class DataProvider {
    public List<User> getData() {

        List <User> list = Arrays.asList(
                new User("nick1", "nick1@gmail.com"),
                new User("nick2", "nick2@gmail.com"),
                new User("nick3", "nick3@gmail.com"),
                new User("nick4", "nick4@gmail.com"),
                new User("nick5", "nick5@gmail.com"),
                new User("nick6", "nick6@gmail.com"),
                new User("nick7", "nick7@gmail.com"),
                new User("nick8", "nick8@gmail.com"),
                new User("nick9", "nick9@gmail.com"),
                new User("nick10", "nick10@gmail.com"));
        return list;
    }

}
