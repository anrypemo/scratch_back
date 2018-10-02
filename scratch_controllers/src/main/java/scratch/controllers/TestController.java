package scratch.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "{\"response\": \"Greetings!\"}";
    }


    @RequestMapping("/login")
    public String login(DampModel dampModel) {
        return "{\"response\": \"Login tested!\"}";
    }

}
