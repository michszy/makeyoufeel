package com.example.szychiewicz.makeyoufeel;

import java.io.Serializable;

public class Emoji implements Serializable {

    private String name;
    private int resource;
    private int identification;
    private char direction;
    private char departure;
    private char[] directions;


    public Emoji(int identification, String name, int resource, char direction, char departure) {
        this.name = name;
        this.identification = identification;
        this.resource = resource;
        this.direction = direction;
        this.departure = departure;
        char[] directions = new char[3];
        directions[0] = direction;
        directions[1] = departure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public char[] getDirections() {
        return directions;
    }

    public void setDirections(char[] directions) {
        this.directions = directions;
    }

    public char getDeparture() {
        return departure;
    }

    public void setDeparture(char departure) {
        this.departure = departure;
    }

    public Emoji setEmoji(Emoji oldEmoji) {
        int identification = oldEmoji.getIdentification();
        String name = oldEmoji.getName();
        int resource = oldEmoji.getResource();
        char[] directions = oldEmoji.getDirections();
        char direction = oldEmoji.getDirection();
        char departure = oldEmoji.getDeparture();
        Emoji newEmoji = new Emoji(identification,name,resource,direction, departure);

        return newEmoji;

    }


}
