package pl.robert.training.breathalyser;

import java.util.TreeMap;

public interface CalculateAlcohol {

//    void drink(int time, StandardDrink alco);

    void drink(TreeMap<Integer, Integer> drunkHistory);

    int whenCanIDrive();
}
