package com.example.sarafan;

public class Prize {
    private int id;
    private String desc;
    public Prize(){};
    public Prize(int id, String description){
        this.id=id;
        this.desc=description;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
