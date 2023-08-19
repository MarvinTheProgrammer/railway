package com.railway.config;

import com.railway.trainYard.doa.impl.CompanyDOAImpl;
import com.railway.trainYard.services.TrainyardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class AppConfig {

    @Bean
    @DependsOn({"jdbcTemplate"})
    public CompanyDOAImpl companyDOA(@Autowired JdbcTemplate jdbcTemplate){
        return new CompanyDOAImpl(jdbcTemplate);
    }

    @Bean
    @DependsOn({"companyDOA"})
    public TrainyardService trainyardService(@Autowired CompanyDOAImpl companyDOA){
        return new TrainyardService(companyDOA);
    }
}
