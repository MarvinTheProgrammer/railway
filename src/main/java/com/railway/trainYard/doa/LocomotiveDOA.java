package com.railway.trainYard.doa;

import com.railway.trainYard.domainModel.Locomotive;

import java.util.function.Consumer;

public interface LocomotiveDOA {

    void getLocomotive(Consumer<Locomotive> locomotiveConsumer);
}
