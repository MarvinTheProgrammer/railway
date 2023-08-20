package com.railway.trainYard.consumer;

import com.railway.trainYard.domainModel.Locomotive;

import java.util.List;
import java.util.function.Consumer;

public class LocamotiveConsumer implements Consumer<Locomotive> {

    private List<Locomotive> allLocomotives;

    public LocamotiveConsumer(List<Locomotive> allLocomotives){
        this.allLocomotives = allLocomotives;
    }

    @Override
    public void accept(Locomotive locomotive){
        allLocomotives.add(locomotive);
    }
}
