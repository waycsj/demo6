package com.example.demo6.controller;

import com.example.demo6.domain.User;
import com.example.demo6.service.UserService;
import lombok.RequiredArgsConstructor;


import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class UserController {
  private final UserService userService;

  @PostMapping("/user")
  public User createUser(@RequestBody User user) {
    return userService.createUser(user);
  }

  @GetMapping("/user")
  public List<User> getAllUsers() {
    return userService.getAllUsers();
  }

  @GetMapping("/user/{userid}")
  public User getUserById(@PathVariable("userid") int userid) {
    return userService.getUserById(userid);
  }

  @PatchMapping("/user/{userid}")
  public User updateUser(@PathVariable("userid") int userid, @RequestBody User user) {
    return userService.updateUser(userid, user);
  }

  @DeleteMapping("/user/{userid}")
  public void deleteUser(@PathVariable("userid") int userid, @RequestBody User user) {
    userService.deleteUser(userid, user);
  }
}
