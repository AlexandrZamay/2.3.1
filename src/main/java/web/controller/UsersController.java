package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.DAO.UserDAO;
import web.DAO.UserDAOImpl;
import web.Model.User;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/db")
public class UsersController {
    private final UserDAOImpl userDAO;
    @Autowired
    public UsersController(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    @GetMapping()
    public String getUsers(ModelMap model){
        List<User> listOfUser = new ArrayList<>();
        User user = new User("Vasya", "Pupkin", 1100);
        User user2 = new User("Kolya", "Perepelkin", 500);
        listOfUser.add(user);
        listOfUser.add(user2);
        model.addAttribute("users" , listOfUser);
        return "Users";
    }

//    private User createUser(){
//        User user = new User();
//        user.setId(1);
//        user.setName("Vasya");
//        user.setSurname("Pupkin");
//        user.setSalary(1200);
//        return user;
//    }
    @GetMapping("/new")
    private String createUser(Model model) {
        model.addAttribute("user", new User());

        return "Users/new";
    }

    @PostMapping
    public String create(@ModelAttribute ("user")User user) {
        userDAO.saveUser(user); //добавить метод
        return "redirect:/list";
    }
}
