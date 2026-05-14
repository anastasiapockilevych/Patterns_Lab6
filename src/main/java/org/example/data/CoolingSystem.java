package org.example.data;

import javax.inject.Inject;

public class CoolingSystem {
    private final CPU cpu;
    private final String model = "Noctua NH-D15";

    @Inject
    public CoolingSystem(CPU cpu) {
        this.cpu = cpu;
    }

    public String getInfo() {
        return String.format("[Cooling] %s | Охолодження для %d ядер @ %.1f GHz",
                model, cpu.getCores(), cpu.getFrequency());
    }

    public int getFanSpeed() {
        return cpu.getFrequency() > 5.0 ? 1800 : 1200;
    }
}