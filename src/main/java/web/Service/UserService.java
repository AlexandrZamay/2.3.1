package web.Service;

import org.springframework.stereotype.Component;
import web.Model.User;

import java.util.List;
@Component

public interface UserService {
    public void saveUser(User user);

    public User getUser(long id);

    public List<User> getAllUsers();

    public void delete(long id);

    public void update(long id, User editedUser);
}
