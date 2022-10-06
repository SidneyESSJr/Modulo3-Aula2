package br.com.uberserverdriver.driver.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.uberserverdriver.driver.domains.User;
import br.com.uberserverdriver.driver.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User save(User user) {
        user.setId(null);
        return userRepository.save(user);
    }

    public List<User> findAll() {
        List<User> users = userRepository.findAll();
        return users;
    }
}
