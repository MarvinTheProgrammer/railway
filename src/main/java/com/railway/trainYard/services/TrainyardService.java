package com.railway.trainYard.services;

import com.railway.trainYard.consumer.LocamotiveConsumer;
import com.railway.trainYard.doa.CompanyDOA;
import com.railway.trainYard.doa.LocomotiveDOA;
import com.railway.trainYard.domainModel.Company;
import com.railway.trainYard.domainModel.Locomotive;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedList;
import java.util.List;

public class TrainyardService {

    private final CompanyDOA companyDOA;

    private final LocomotiveDOA locomotiveDOA;

    @Autowired
    public TrainyardService(CompanyDOA companyDOA, LocomotiveDOA locomotiveDOA){
        this.companyDOA = companyDOA;
        this.locomotiveDOA = locomotiveDOA;
    }

    public List<Company> getCompanies(){
        return companyDOA.getCompanies();
    }

    public List<Locomotive> getLocomotives(){
        List<Locomotive> locomotives = new LinkedList<>();
        LocamotiveConsumer locamotiveConsumer = new LocamotiveConsumer(locomotives);

        locomotiveDOA.getLocomotive(locamotiveConsumer);

        return locomotives;
    }
}
