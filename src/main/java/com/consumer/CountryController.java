package com.consumer;

import localhost._8080.soap_service.GetCountryResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private final CountryClientService countryClientService;

    public CountryController(CountryClientService countryClientService) {
        this.countryClientService = countryClientService;
    }

    @GetMapping("/getCountry")
    public GetCountryResponse getCountry(@RequestParam String name) {
        return countryClientService.getCountry(name);
    }
}
