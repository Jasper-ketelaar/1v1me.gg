package gg.ovome.backend.api;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class homePageController {
    public class HomePageController {

        //@GetMapping
        public String getHomepage() {
            return "No available fighters at this time";
        }

    }
}
