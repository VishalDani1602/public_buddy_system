package com.example.publicbuddysystem.Controller;

import com.example.publicbuddysystem.Model.User;
import com.example.publicbuddysystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin
public class LoginController {
    private final UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<Integer> login(@RequestBody User user){
        return ResponseEntity.ok(userService.login(user));
    }
}
