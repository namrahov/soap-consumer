package com.consumer.generated;

import com.dataaccess.webservicesserver.NumberToWords;
import com.dataaccess.webservicesserver.NumberToWordsResponse;
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

    public NumberToWords createNumberToWords() {
        return new NumberToWords();
    }

    public NumberToWordsResponse createNumberToWordsResponse() {
        return new NumberToWordsResponse();
    }

    // Add factory methods for each schema-derived class here
}
