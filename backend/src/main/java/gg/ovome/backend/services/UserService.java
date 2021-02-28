package gg.ovome.backend.services;

import gg.ovome.backend.model.User;
import gg.ovome.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

//    public Iterable<User>findAll() {
//        //wrm the fuck kan ik hier geen findAll doen
//        //return this.repository.
//    }
}
