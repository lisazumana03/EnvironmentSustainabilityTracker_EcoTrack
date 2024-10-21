package za.ac.cput.environmentsustainabilitytracker_fullstack.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import za.ac.cput.environmentsustainabilitytracker_fullstack.model.User;
import za.ac.cput.environmentsustainabilitytracker_fullstack.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getById(Long userId) {
        Optional<User> opt = userRepository.findById(userId);
        User user = null;
        if(opt.isPresent()) {
            user = opt.get();
        }
        else {
            throw new RuntimeException("Sorry, unable to find user's id: " + userId);
        }
        return user;
    }

    @Override
    public User getByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

}
