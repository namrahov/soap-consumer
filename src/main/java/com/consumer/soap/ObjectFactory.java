package com.consumer.soap;

import org.oorsprong.websamples.CapitalCity;
import org.oorsprong.websamples.CapitalCityResponse;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {}

    public CapitalCity createCapitalCity() {
        return new CapitalCity();
    }

    public CapitalCityResponse createCapitalCityResponse() {
        return new CapitalCityResponse();
    }
}