package com.consumer;

import localhost._8080.soap_service.GetCountryRequest;
import localhost._8080.soap_service.GetCountryResponse;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class CountryClientService {

    private final WebServiceTemplate webServiceTemplate;

    public CountryClientService(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public GetCountryResponse getCountry(String countryName) {
        GetCountryRequest request = new GetCountryRequest();
        request.setName(countryName);

        return (GetCountryResponse) webServiceTemplate.marshalSendAndReceive(request);
    }
}
