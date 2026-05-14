package org.example.data;

import javax.inject.Inject;

public class PriceCalculator {
    private final CPU cpu;
    private final GPU gpu;
    private final RAM ram;

    @Inject
    public PriceCalculator(CPU cpu, GPU gpu, RAM ram) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
    }

    public double calculateTotal() {
        double cpuPrice = cpu.getCores() * 800.0;
        double gpuPrice = gpu.getVram() * 3500.0;
        double ramPrice = ram.getSize() * 150.0;
        return cpuPrice + gpuPrice + ramPrice;
    }

    public String getPriceBreakdown() {
        return String.format(
                "[PriceCalculator] CPU: %.0f грн | GPU: %.0f грн | RAM: %.0f грн | Разом: %.0f грн",
                cpu.getCores() * 800.0,
                gpu.getVram() * 3500.0,
                ram.getSize() * 150.0,
                calculateTotal()
        );
    }
}