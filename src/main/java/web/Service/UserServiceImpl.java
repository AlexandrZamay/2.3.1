package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Model.User;
import web.Repositories.UserRepository;

import javax.persistence.EntityManager;
import java.util.List;
@Service
public class UserServiceImpl implements  UserService{
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl( UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getUser(long id) {
       return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


    @Override
    public void delete(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void update(long id, User editedUser) {
        editedUser.setId(id);
        userRepository.save(editedUser);
    }
}
