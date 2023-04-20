package web.DAO;

import org.springframework.stereotype.Component;
import web.Model.User;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserDAOImpl implements UserDAO{

    private List<User> users;
    private static int USER_COUNT;
    {
        users = new ArrayList<>();

        users.add(new User(++USER_COUNT,"Sasha", "Zamay", 3500));
        users.add(new User(++USER_COUNT,"Danil", "Ikonenko", 3500));
        users.add(new User(++USER_COUNT,"Victoria", "Versh", 2000));
        users.add(new User(++USER_COUNT,"Pavel", "Taranov", 4000));


    }
    @Override
    public void saveUser(User user) {       //добавление в БД
        user.setId(++USER_COUNT);
        users.add(user);
    }

    @Override
    public User getUser(long id) {
        return users.stream().filter(user -> user.getId()==id).findAny().orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public void removeUserById(long id) {

    }

    public void update(int id, User editedUser) { //user приходит от @ModelAttribute в методе update
        User userForEdit = getUser(id);
        userForEdit.setName(editedUser.getName());
    }

    public void delete(int id) {
        users.removeIf(user -> user.getId()== id);
    }



}
