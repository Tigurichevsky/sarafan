package com.example.sarafan;

public class Participant {
    private int id;
    private String desc;

    public Participant(){};
    public Participant(int id, String description){
        this.id=id;
        this.desc=description;

    }
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
