package web.DAO;

import web.Model.User;

import java.util.List;

public interface UserDAO {

    public void saveUser(String name, String surname);

    public User getUser(long id);

    public List<User> getAllUsers();

    public void removeUserById(long id);

}
