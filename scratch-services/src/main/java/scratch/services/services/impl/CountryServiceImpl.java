package scratch.services.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import scratch.services.models.Country;
import scratch.services.repository.CountryRepository;
import scratch.services.services.CountryService;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class CountryServiceImpl implements CountryService {

    @Resource
    private CountryRepository countryRepository;

    @Override
    public List<Country> fetchCountries() {
        return this.countryRepository.fetchCountries();
    }
}
