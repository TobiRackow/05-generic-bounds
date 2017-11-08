package de.fhro.inf.prg3.a05.model;

public abstract class Plant implements Comparable<Plant>{
    private final double height;
    private final String family;
    private final String name;
    private final PlantColor plantColor;

    public Plant(double height, String family, String name,PlantColor plantColor) {
        this.height = height;
        this.family = family;
        this.name = name;
        this.plantColor = plantColor;
    }

    public double getHeight(){
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }
    public PlantColor getColor() {
        return plantColor;
    }
}
