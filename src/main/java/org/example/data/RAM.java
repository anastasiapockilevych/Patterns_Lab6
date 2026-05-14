package org.example.data;

import javax.inject.Inject;

public class RAM {
    private final int size = 64;
    private final String type = "DDR5";
    private final int speed = 6000;

    @Inject
    public RAM() {}

    public int getSize() { return size; }
    public String getType() { return type; }

    public String getInfo() {
        return String.format("[RAM] %d GB %s @ %d MHz", size, type, speed);
    }
}