package de.fhro.inf.prg3.a05.model;

public enum PlantColor {

    GREEN("Green"),
    YELLOW("Yellow"),
    RED("Red"),
    BLUE("Blue"),
    ORANGE("Orange");

    private String color;

    PlantColor(String color) {
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}
