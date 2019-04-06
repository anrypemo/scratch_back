package scratch.manager;

import scratch.services.models.Country;

import java.util.List;

public interface CountryManager {

    List<Country> fetchCountries();
}
