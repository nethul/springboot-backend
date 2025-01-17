package edu.ijse.pos_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ijse.pos_system.dto.UserLoginReq;
import edu.ijse.pos_system.entity.User;
import edu.ijse.pos_system.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public List<User> getAllUsers() {
        return  userRepository.findAll();

    }

    @Override
    public void deleteUser(Long id) {
         userRepository.deleteById(id);
    }

    @Override
    public User updateUser(User user) {
       return userRepository.save(user);
    }

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    
}
