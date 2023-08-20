package com.railway.trainYard.domainModel;

import java.util.UUID;

public class Locomotive {

    private long id;
    private UUID uuid;
    private int type;
    private int company;
    private String name;

    public Locomotive(long id, UUID uuid, int type, int company, String name) {
        this.id = id;
        this.uuid = uuid;
        this.type = type;
        this.company = company;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCompany() {
        return company;
    }

    public void setCompany(int company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
