package com.example.sarafan;

public class Result {
    private Prize prize;
    private Participant participant;

    public Result(){};
    public Result(Prize prize, Participant participant){
        this.prize=prize;
        this.participant=participant;

    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public Prize getPrize() {
        return prize;
    }

    public void setPrize(Prize prize) {
        this.prize = prize;
    }
}
