package de.fhro.inf.prg3.a05;

import de.fhro.inf.prg3.a05.collections.SimpleFilter;
import de.fhro.inf.prg3.a05.collections.SimpleList;
import de.fhro.inf.prg3.a05.collections.SimpleListImpl;
import de.fhro.inf.prg3.a05.model.Plant;
import de.fhro.inf.prg3.a05.model.PlantColor;

import java.util.Iterator;

public class PlantBed<T extends Plant> {

    private  SimpleList<T> plants;

    public PlantBed(){
        plants = new SimpleListImpl<>();
    }


    public void add(T plant) {
        plants.add(plant);
    }

    public int size() {
        return plants.size();
    }

    public SimpleList<T> getPlantsByColor(PlantColor color){
        //return plants.filter(item -> item.getColor().equals(color));
        SimpleList<T> result = new SimpleListImpl<>();
        for(T o : plants){
            if(o.getColor() == color){
                result.add(o);
            }
        }
        return result;

    }
    public SimpleList<T> getPlants() {
        //hack to get a copy of the current list
        return plants.map(p -> p);
    }

}
