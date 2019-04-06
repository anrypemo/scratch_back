package scratch.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import scratch.services.CountryUiService;
import scratch.services.models.Country;
import scratch.services.services.CountryService;

import java.util.List;

@Repository
public class CountryUiServiceImpl implements CountryUiService {

    @Autowired
    private CountryService countryService;

    @Override
    public List<Country> fetchCountries() {
        return this.countryService.fetchCountries();
    }
}
