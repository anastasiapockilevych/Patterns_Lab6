package org.example.data;

import javax.inject.Inject;

public class PowerSupply {
    private final int wattage = 1000;
    private final String rating = "80+ Platinum";

    @Inject
    public PowerSupply() {}

    public int getWattage() { return wattage; }

    public String getInfo() {
        return String.format("[PSU] %d W | %s", wattage, rating);
    }

    public boolean canPower(int requiredWatts) {
        return wattage >= requiredWatts;
    }
}