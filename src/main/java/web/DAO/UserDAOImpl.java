//package web.DAO;
//
//import org.springframework.stereotype.Component;
//import web.Model.User;
//
//import javax.persistence.EntityManager;
//import java.util.ArrayList;
//import java.util.List;
//@Component
//public class UserDAOImpl implements UserDAO{
//    public EntityManager entityManager;
//    private List<User> users;
//    private static int USER_COUNT;
//    {
//        users = new ArrayList<>();
//
//        users.add(new User(++USER_COUNT,"Sasha Zamay", "Zamay@mail.ru", 3500));
//        users.add(new User(++USER_COUNT,"Danil Ikonenko", "Ikonenko@rambler.ru", 3500));
//        users.add(new User(++USER_COUNT,"Victoria Versh", "Versh@gmail.com", 2000));
//        users.add(new User(++USER_COUNT,"Pavel Taranov", "Taranov@yandex.ru", 4000));
//
//
//    }
//    @Override
//    public void saveUser(User user) {       //добавление в БД
//        user.setId(++USER_COUNT);
//        users.add(user);
//    }
//
//    @Override
//    public User getUser(long id) {
//        return users.stream().filter(user -> user.getId()==id).findAny().orElse(null);
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        return users;
//    }
//
//
//    @Override
//    public void update(int id, User editedUser) { //user приходит от @ModelAttribute в методе update
//        User userForEdit = getUser(id);
//        userForEdit.setName(editedUser.getName());
//    }
//    @Override
//    public void delete(int id) {
//        users.removeIf(user -> user.getId()== id);
//    }
//
//
//
//}
