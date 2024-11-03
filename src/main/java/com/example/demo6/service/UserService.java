package com.example.demo6.service;

import com.example.demo6.domain.User;
import com.example.demo6.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor//성자를 생성해 주므로, 생성자 구현이 필요 없음
public class UserService {
  private final UserRepository userRepository;

  public User createUser(User user) {
    return userRepository.save(user);
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public User getUserById(int id) {
    return userRepository.findById(id).get();
  }

  public User updateUser(int id,User user) {
    User oldUser = userRepository.findById(id).get();
    oldUser.setName(user.getName());
    oldUser.setEmail(user.getEmail());
    oldUser.setAge(user.getAge());
    oldUser.setAddress(user.getAddress());
    userRepository.save(oldUser);
    return oldUser;
  }

  public void deleteUser(int id, User user) {
    userRepository.deleteById(id);
  }
}
