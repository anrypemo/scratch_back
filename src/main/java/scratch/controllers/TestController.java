package scratch.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import scratch.models.User;
import scratch.testService.ImageTest;

@CrossOrigin
@RestController
public class TestController {


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public DampModel login(@RequestBody DampModel dampModel) {
        return dampModel;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public User login() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        //just example of getting logged user's name
        User user = new User();
        user.setUsername(auth.getName());
        return user;
    }

    @RequestMapping(value = "/testCountry", method = RequestMethod.GET)
    @ResponseBody
    public DampModel testCountry() {
        try {
            ImageTest imageTest = new ImageTest();
            imageTest.getLocation();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
