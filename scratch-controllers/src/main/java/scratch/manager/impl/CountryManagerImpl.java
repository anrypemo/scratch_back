package scratch.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scratch.manager.CountryManager;
import scratch.services.CountryUiService;
import scratch.services.models.Country;

import java.util.List;

@Service
public class CountryManagerImpl implements CountryManager {

    @Autowired
    private CountryUiService countryUiService;

    @Override
    public List<Country> fetchCountries() {
        return this.countryUiService.fetchCountries();
    }
}
