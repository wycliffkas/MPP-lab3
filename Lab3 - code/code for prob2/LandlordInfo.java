package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
    private List<Building> buildings;

    public LandlordInfo() {
        this.buildings = new ArrayList<>();
    }


    public void addBuilding(Building building) {
        this.buildings.add(building);
    }

    public double calcProfits() {
        double totalProfit = 0;
        for (Building building : buildings) {
            totalProfit += building.calculateProfit();
        }

        return totalProfit;
    }
}
