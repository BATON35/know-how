package com.konrad.knowhow.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {
    @Value("${user}")
    String userName;
    @Value("${url}")
    String url;
    @Autowired
    private Environment env;
    String password = env.getProperty("password");
}


//to pas information from *.properties

//- add name.properties file(best place is resources)
//- add @PropertySource annotation with path to name.properties(including name)
//- add @Value annotation to corresponding fields. Use convection "${fieldName}
//or
//- add Environment object and use getProperty method