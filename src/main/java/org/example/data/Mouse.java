package org.example.data;

import javax.inject.Inject;

public class Mouse {
    private final String model = "Logitech G Pro X Superlight 2";
    private final int dpi = 32000;
    private final double weight = 60.0;
    private final boolean wireless = true;

    @Inject
    public Mouse() {}

    public int getDpi() { return dpi; }
    public boolean isWireless() { return wireless; }

    public String getInfo() {
        return String.format("[Mouse] %s | DPI: %d | Вага: %.0fg | Бездротова: %s",
                model, dpi, weight, wireless ? "Так" : "Ні");
    }
}