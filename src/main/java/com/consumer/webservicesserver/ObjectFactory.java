package com.consumer.webservicesserver;

import com.dataaccess.webservicesserver.NumberToWords;
import com.dataaccess.webservicesserver.NumberToWordsResponse;


import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {}

    public NumberToWords createNumberToWords() {
        return new NumberToWords();
    }

    public NumberToWordsResponse createNumberToWordsResponse() {
        return new NumberToWordsResponse();
    }


}
