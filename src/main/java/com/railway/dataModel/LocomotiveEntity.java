package com.railway.dataModel;

import java.util.UUID;


public class LocomotiveEntity {

    private long id;

    private UUID locomotive_uuid;

    private int type_id;

    private int comapny_id;

    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UUID getLocomotive_uuid() {
        return locomotive_uuid;
    }

    public void setLocomotive_uuid(UUID locomotive_uuid) {
        this.locomotive_uuid = locomotive_uuid;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public int getComapny_id() {
        return comapny_id;
    }

    public void setComapny_id(int comapny_id) {
        this.comapny_id = comapny_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
