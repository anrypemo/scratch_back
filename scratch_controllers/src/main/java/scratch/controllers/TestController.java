package scratch.controllers;

import org.springframework.web.bind.annotation.*;
import scratch.testService.ImageTest;

@CrossOrigin
@RestController
public class TestController {


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public DampModel login(@RequestBody DampModel dampModel) {
        return dampModel;
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
