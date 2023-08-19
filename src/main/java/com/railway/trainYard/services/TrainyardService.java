package com.railway.trainYard.services;

import com.railway.trainYard.doa.CompanyDOA;
import com.railway.trainYard.domainModel.Company;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TrainyardService {

    private final CompanyDOA companyDOA;

    @Autowired
    public TrainyardService(CompanyDOA companyDOA){
        this.companyDOA = companyDOA;
    }

    public List<Company> getCompanies(){
        return companyDOA.getCompanies();
    }
}
