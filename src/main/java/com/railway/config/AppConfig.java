package com.railway.config;

import com.railway.trainYard.doa.impl.CompanyDOAImpl;
import com.railway.trainYard.doa.impl.LocomotiveDOAImpl;
import com.railway.trainYard.services.TrainyardService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class AppConfig {

    @Bean
    public CompanyDOAImpl companyDOA(JdbcTemplate jdbcTemplate){
        return new CompanyDOAImpl(jdbcTemplate);
    }

    @Bean
    public TrainyardService trainyardService(CompanyDOAImpl companyDOA, LocomotiveDOAImpl locomotiveDOA){
        return new TrainyardService(companyDOA, locomotiveDOA);
    }
}
