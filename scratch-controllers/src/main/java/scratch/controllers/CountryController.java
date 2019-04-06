package scratch.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import scratch.manager.CountryManager;
import scratch.services.models.Country;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/country")
public class CountryController {

    @Autowired
    private CountryManager countryManager;


    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public List<Country> fetchCountries() {
        return this.countryManager.fetchCountries();
    }
}
