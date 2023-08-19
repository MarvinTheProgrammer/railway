package com.railway.trainYard.doa.impl;

import com.railway.trainYard.doa.CompanyDOA;
import com.railway.trainYard.domainModel.Company;
import com.railway.trainYard.domainModel.CompanyRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CompanyDOAImpl implements CompanyDOA {

    private final JdbcTemplate jdbcTemplate;
    private final String getCompanies = "SELECT id, name FROM train_yard.company";

    @Autowired
    public CompanyDOAImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Company> getCompanies(){
        return jdbcTemplate.query(getCompanies, new CompanyRowMapper());
    }

}
