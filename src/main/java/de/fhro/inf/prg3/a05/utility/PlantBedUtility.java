package de.fhro.inf.prg3.a05.utility;

import de.fhro.inf.prg3.a05.PlantBed;
import de.fhro.inf.prg3.a05.collections.SimpleList;
import de.fhro.inf.prg3.a05.collections.SimpleListImpl;
import de.fhro.inf.prg3.a05.model.Plant;
import de.fhro.inf.prg3.a05.model.PlantColor;

import java.util.HashMap;
import java.util.Map;

public abstract class PlantBedUtility {


    private PlantBedUtility() {
    }

    public static <T extends Plant> Map<PlantColor, SimpleList<T>> splitBedByColor(PlantBed<? extends T> plantBed) {
        Map<PlantColor, SimpleList<T>> result = new HashMap<>();

        for (T plant : plantBed.getPlants()) {
			/* if the result does not contain the color of the plant
			 * insert the color and a new empty list */
            if (!result.containsKey(plant.getColor())) {
                result.put(plant.getColor(), new SimpleListImpl<>());
            }
			/* get the corresponding list and add the current plant */
            result.get(plant.getColor()).add(plant);
        }

        return result;

    }
}
