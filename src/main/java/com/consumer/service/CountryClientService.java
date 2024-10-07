package com.consumer.service;

import com.dataaccess.webservicesserver.NumberToWords;
import com.dataaccess.webservicesserver.NumberToWordsResponse;
import org.oorsprong.websamples.CapitalCity;
import org.oorsprong.websamples.CapitalCityResponse;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.math.BigInteger;

@Service

public class CountryClientService {

    private final WebServiceTemplate webServiceTemplate;
    private final WebServiceTemplate webServiceTemplateForCurrency;

    public CountryClientService(WebServiceTemplate webServiceTemplate, WebServiceTemplate webServiceTemplateForCurrency) {
        this.webServiceTemplate = webServiceTemplate;
        this.webServiceTemplateForCurrency = webServiceTemplateForCurrency;
    }

    public CapitalCityResponse getCapitalCity(String countryISOCode) {
        // Create the request object using the generated JAXB class
        CapitalCity request = new CapitalCity();
        request.setSCountryISOCode(countryISOCode);

        // Send the request and receive the response
        CapitalCityResponse response = (CapitalCityResponse) webServiceTemplate.marshalSendAndReceive(request);

        // Extract the capital city result
        return response;
    }

    public NumberToWordsResponse getWord(String ubiNum) {
        NumberToWords request = new NumberToWords();
        request.setUbiNum(BigInteger.valueOf(Long.parseLong(ubiNum)));

        return (NumberToWordsResponse) webServiceTemplateForCurrency.marshalSendAndReceive(request);
    }

}


