package com.example.sarafan;

public class Promo {
    private int id;
    private String name;
    private String description;
    private Prize prizes;
    private Participant participants;

    public Promo(){};
    public Promo(int id, String name, String description, Prize prizes, Participant participants){
        this.id=id;
        this.name=name;
        this.description=description;
        this.prizes=prizes;
        this.participants=participants;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Prize getPrizes() {
        return prizes;
    }

    public void setPrizes(Prize prizes) {
        this.prizes = prizes;
    }

    public Participant getParticipants() {
        return participants;
    }

    public void setParticipants(Participant participants) {
        this.participants = participants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
