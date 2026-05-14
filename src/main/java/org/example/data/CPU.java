package org.example.data;

import javax.inject.Inject;

public class CPU {
    private final String model = "Intel Core i9-13900K";
    private final int cores = 24;
    private final double frequency = 5.8;

    @Inject
    public CPU() {}

    public int getCores() { return cores; }
    public double getFrequency() { return frequency; }

    public String getInfo() {
        return String.format("[CPU] %s | Ядра: %d | Частота: %.1f GHz",
                model, cores, frequency);
    }
}