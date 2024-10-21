package za.ac.cput.environmentsustainabilitytracker_fullstack.service;

import java.util.List;

import za.ac.cput.environmentsustainabilitytracker_fullstack.model.User;

public interface UserService {
    void createUser(User user);
    User getById(Long userId);
    User getByUsername(String username);
    List<User> findAllUsers();
    void deleteUser(Long userId);
}
