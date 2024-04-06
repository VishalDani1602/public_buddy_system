package com.example.publicbuddysystem.Controller;

import com.example.publicbuddysystem.Model.User;
import com.example.publicbuddysystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/test")
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        //return userService.getAllUsers();
        return "test";
    }

    @GetMapping("/{user_id}")
    public ResponseEntity<Optional<User>> getSpecificUsers(@PathVariable("user_id") int id) {
        return ResponseEntity.ok(userService.getSpecificUser(id));
    }
}

