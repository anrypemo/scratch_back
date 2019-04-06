package scratch.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import scratch.manager.UserUiManager;
import scratch.user.UserDto;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    public UserUiManager userUiManager;


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @ResponseBody
    public UserDto login() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        //just example of getting logged scratch.user's name
        return this.userUiManager.getUserByUsername(auth.getName());
    }

}
