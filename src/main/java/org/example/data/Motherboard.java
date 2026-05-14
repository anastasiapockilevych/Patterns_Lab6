package org.example.data;

import javax.inject.Inject;

public class Motherboard {
    private final CPU cpu;
    private final RAM ram;
    private final String model = "ASUS ROG Maximus Z790";

    @Inject
    public Motherboard(CPU cpu, RAM ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getInfo() {
        return String.format("[Motherboard] %s | %s | RAM: %d GB %s",
                model, cpu.getInfo(), ram.getSize(), ram.getType());
    }

    public boolean isCompatible() {
        return ram.getType().equals("DDR5") && cpu.getCores() > 0;
    }
}