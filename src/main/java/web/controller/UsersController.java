package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.Model.User;
import web.Service.UserService;

@Controller
@RequestMapping("/list")
public class UsersController {

    private final UserService userService;
    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping()
//    public String getUsers(ModelMap model){
//        List<User> listOfUser = new ArrayList<>();
//        User user = new User("Vasya", "Pupkin", 1100);
//        User user2 = new User("Kolya", "Perepelkin", 500);
//        listOfUser.add(user);
//        listOfUser.add(user2);
//        model.addAttribute("users" , listOfUser);
//        return "Users";
//    }

//    private User createUser(){
//        User user = new User();
//        user.setId(1);
//        user.setName("Vasya");
//        user.setSurname("Pupkin");
//        user.setSalary(1200);
//        return user;
//    }
    @GetMapping()
    public String hello(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "usersList";
    }
    @GetMapping("/{id}")
    public String show(@PathVariable("id")int id, Model model) {
    model.addAttribute("user", userService.getUser(id));
    return "userPage";
    }

    @GetMapping("/new")
    private String createUser(Model model) {
        model.addAttribute("user", new User());

        return "new";
    }

    @PostMapping()
    public String create(@ModelAttribute ("user")User user) {
        userService.saveUser(user); //добавить метод
        return "redirect:/list";
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("user", userService.getUser(id));
        return "edit";

    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("user")User user, @PathVariable("id") int id) {
        userService.update(id, user);
        return "redirect:/list";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id")int id) {
        userService.delete(id);
        return "redirect:/list";
    }

}
