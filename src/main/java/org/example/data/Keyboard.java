package org.example.data;

import javax.inject.Inject;

public class Keyboard {
    private final String model = "Keychron Q1 Pro";
    private final String switchType = "Brown";
    private final boolean wireless = true;

    @Inject
    public Keyboard() {}

    public String getSwitchType() { return switchType; }
    public boolean isWireless() { return wireless; }

    public String getInfo() {
        return String.format("[Keyboard] %s | Свічі: %s | Бездротова: %s",
                model, switchType, wireless ? "Так" : "Ні");
    }
}