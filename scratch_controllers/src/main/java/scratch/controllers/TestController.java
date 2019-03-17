package scratch.controllers;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class TestController {


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public DampModel login(@RequestBody DampModel dampModel) {
        return dampModel;
    }

}
