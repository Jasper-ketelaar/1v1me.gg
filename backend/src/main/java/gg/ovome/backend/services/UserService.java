package gg.ovome.backend.services;

import gg.ovome.backend.model.User;
import gg.ovome.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    private UserRepository repository;

//    public Iterable<User>findAll() {
//        return this.repository.find
//    }
}
