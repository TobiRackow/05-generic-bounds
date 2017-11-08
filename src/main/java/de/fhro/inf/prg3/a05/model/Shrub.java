package de.fhro.inf.prg3.a05.model;

import java.util.Objects;

public class Shrub extends Plant{


    public Shrub(double height, String family, String name,PlantColor plantColor) {
        super(height, family, name,plantColor);
        if (!Objects.equals(plantColor.getColor(), "Green")){
            throw new IllegalStateException("Shrub must be green...");
        }
    }

    @Override
    public int compareTo(Plant o) {
        return 0;
    }
}
