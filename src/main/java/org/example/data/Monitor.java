package org.example.data;

import javax.inject.Inject;

public class Monitor {
    private final String model = "LG UltraGear 27GP950-B";
    private final int resolution = 3840;
    private final int refreshRate = 144;
    private final String panel = "IPS";

    @Inject
    public Monitor() {}

    public int getResolution() { return resolution; }
    public int getRefreshRate() { return refreshRate; }
    public String getPanel() { return panel; }

    public String getInfo() {
        return String.format("[Monitor] %s | %dp | %d Hz | %s",
                model, resolution, refreshRate, panel);
    }
}