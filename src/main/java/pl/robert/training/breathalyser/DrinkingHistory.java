package pl.robert.training.breathalyser;

import java.util.TreeMap;

public class DrinkingHistory {
    private TreeMap<Integer, Integer> timeTable = new TreeMap<>();

    public TreeMap<Integer, Integer> getTimeTable() {
        return timeTable;
    }

    public void setTimeTable(TreeMap<Integer, Integer> timeTable) {
        this.timeTable = timeTable;
    }
}
