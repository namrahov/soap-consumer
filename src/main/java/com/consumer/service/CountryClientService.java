package com.consumer.service;

//import localhost._8080.soap_service.GetCountryRequest;
//import localhost._8080.soap_service.GetCountryResponse;

import org.oorsprong.websamples.CapitalCity;
import org.oorsprong.websamples.CapitalCityResponse;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class CountryClientService {

    private final WebServiceTemplate webServiceTemplate;

    public CountryClientService(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

//    public GetCountryResponse getCountry(String countryName) {
//        GetCountryRequest request = new GetCountryRequest();
//        request.setName(countryName);
//
//        return (GetCountryResponse) webServiceTemplate.marshalSendAndReceive(request);
//    }


    public CapitalCityResponse getCapitalCity(String countryISOCode) {
        // Create the request object using the generated JAXB class
        CapitalCity request = new CapitalCity();
        request.setSCountryISOCode(countryISOCode);

        // Send the request and receive the response
        CapitalCityResponse response = (CapitalCityResponse) webServiceTemplate.marshalSendAndReceive(request);

        // Extract the capital city result
        return response;
    }


}


