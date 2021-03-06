package gg.ovome.backend.api;

import gg.ovome.backend.model.User;
import gg.ovome.backend.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;


@AllArgsConstructor
@RestController
public class HomePageController {




    private final UserRepository userRepository;

        @GetMapping(value="/users")
        public List<User> getHomepage() {
            return userRepository.findAll();
        }



    @PostConstruct
    public void addUser(){
        System.out.println("Hi");
        User user = new User();
        user.setName("Pietje").setVerified(true).setEmail("sdasd@sada.com");
        userRepository.save(user);
    }

}
