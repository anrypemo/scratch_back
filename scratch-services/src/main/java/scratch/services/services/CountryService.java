package scratch.services.services;

import scratch.services.models.Country;

import java.util.List;

public interface CountryService {

    List<Country> fetchCountries();
}
