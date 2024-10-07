package com.consumer.controller;

import com.consumer.service.CountryClientService;
//import localhost._8080.soap_service.GetCountryResponse;
import org.oorsprong.websamples.CapitalCityResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    private final CountryClientService countryClientService;

    public CountryController(CountryClientService countryClientService) {
        this.countryClientService = countryClientService;
    }

//    @GetMapping("/getCountry")
//    public GetCountryResponse getCountry(@RequestParam String name) {
//        return countryClientService.getCountry(name);
//    }

    @GetMapping("/getCapitalCity/{countryCode}")
    public CapitalCityResponse getCapitalCity(@PathVariable String countryCode) {
        return countryClientService.getCapitalCity(countryCode);
    }
}
