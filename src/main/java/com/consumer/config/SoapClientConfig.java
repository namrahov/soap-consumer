package com.consumer.config;

import org.apache.http.impl.client.HttpClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class SoapClientConfig {

    @Bean
    public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller marshaller) {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();

        // Set the marshaller and unmarshaller
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);

        // Set the default URI for the SOAP service
        webServiceTemplate.setDefaultUri("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso");

        // Set the message sender with HTTP components
        HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender();
        webServiceTemplate.setMessageSender(messageSender);

        return webServiceTemplate;
    }

    @Bean
    public WebServiceTemplate webServiceTemplateForCurrency(Jaxb2Marshaller marshaller) {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();

        // Set the marshaller and unmarshaller
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);

        // Set the default URI for the SOAP service
        webServiceTemplate.setDefaultUri("https://www.dataaccess.com/webservicesserver/NumberConversion.wso");

        // Set the message sender with HTTP components
        HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender();
        webServiceTemplate.setMessageSender(messageSender);

        return webServiceTemplate;
    }

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // Specify the package where the generated JAXB classes are located
        marshaller.setContextPath("com.consumer.generated:com.consumer.webservicesserver");
        return marshaller;
    }


}


