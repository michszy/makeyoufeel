package com.example.szychiewicz.makeyoufeel;



public class Questions {

    private String questions;
    private int identification;
    private String direction;

    public Questions(String questions, int identification, String direction) {
        this.questions = questions;
        this.identification = identification;
        this.direction = direction;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
