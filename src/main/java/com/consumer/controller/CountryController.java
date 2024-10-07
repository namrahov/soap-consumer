package com.consumer.controller;

import com.consumer.service.CountryClientService;
import com.dataaccess.webservicesserver.NumberToWordsResponse;
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

    @GetMapping("/getCapitalCity/{countryCode}")
    public CapitalCityResponse getCapitalCity(@PathVariable String countryCode) {
        return countryClientService.getCapitalCity(countryCode);
    }

    @GetMapping("/getCurrency")
    public NumberToWordsResponse getWord(@RequestParam String ubiNum) {
        return countryClientService.getWord(ubiNum);
    }
}
