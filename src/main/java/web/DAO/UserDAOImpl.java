package web.DAO;

import org.springframework.stereotype.Component;
import web.Model.User;

import java.util.List;
@Component
public class UserDAOImpl implements UserDAO{
    @Override
    public void saveUser(User user) { //добавление в БД
        user.setId(6);//автоинкрементирование вместо 6
    }

    @Override
    public User getUser(long id) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void removeUserById(long id) {

    }



}
