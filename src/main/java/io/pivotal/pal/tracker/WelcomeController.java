package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private String helloString;

    public WelcomeController(@Value("${welcome.message}")String helloString){
        this.helloString = helloString;
    }

    @GetMapping("/")
    public String sayHello() {
        return helloString;
    }
}
