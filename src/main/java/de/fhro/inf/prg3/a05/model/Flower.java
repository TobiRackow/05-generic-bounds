package de.fhro.inf.prg3.a05.model;

import java.util.Objects;

public class Flower extends Plant{

    public Flower(double height, String family, String name, PlantColor plantColor) {
        super(height, family, name, plantColor);
        if (Objects.equals(plantColor.getColor(), "Green")){
            throw new IllegalStateException("Flower cannot be green..");
        }
    }

    @Override
    public int compareTo(Plant o) {
        return 0;
    }
}
