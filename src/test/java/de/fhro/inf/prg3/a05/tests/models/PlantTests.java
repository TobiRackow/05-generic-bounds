package de.fhro.inf.prg3.a05.tests.models;

import de.fhro.inf.prg3.a05.PlantBed;
import de.fhro.inf.prg3.a05.collections.SimpleFilter;
import de.fhro.inf.prg3.a05.collections.SimpleList;
import de.fhro.inf.prg3.a05.collections.SimpleListImpl;
import de.fhro.inf.prg3.a05.model.Flower;
import de.fhro.inf.prg3.a05.model.Plant;
import de.fhro.inf.prg3.a05.model.PlantColor;
import de.fhro.inf.prg3.a05.model.Shrub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlantTests {

    private Flower flower;
    private Flower flower2;
    private Shrub shrub;
    private PlantBed<Plant> plantbed;

    @Test
    void generatePlants(){
        assertThrows(IllegalStateException.class, () -> new Flower(3.5,"Blumenfamilie", "Tulpe", PlantColor.GREEN));
        assertThrows(IllegalStateException.class, () -> new Shrub(4.5,"Buschfamilie", "Busch1", PlantColor.RED));
    }

    @Test
    void testPlantBed(){
        flower = new Flower(3.5,"Blumenfamilie", "Tulpe", PlantColor.ORANGE);
        flower2 = new Flower(3.5,"Blumenfamilie", "Tulpe", PlantColor.RED);

        plantbed = new PlantBed<>();
        plantbed.add(flower);
        plantbed.add(flower2);

        SimpleList<Plant> result = plantbed.getPlantsByColor(PlantColor.RED);

        for(Plant p : result){
            assertEquals(PlantColor.RED, p.getColor());
        }

    }
}
