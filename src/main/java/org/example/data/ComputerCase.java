package org.example.data;

import javax.inject.Inject;

public class ComputerCase {
    private final GPU gpu;
    private final PowerSupply powerSupply;
    private final String model = "Lian Li O11 Dynamic EVO";

    @Inject
    public ComputerCase(GPU gpu, PowerSupply powerSupply) {
        this.gpu = gpu;
        this.powerSupply = powerSupply;
    }

    public String getInfo() {
        boolean powered = powerSupply.canPower(450 + gpu.getVram() * 10);
        return String.format("[Case] %s | GPU: %s | Живлення: %s",
                model, gpu.getInfo(), powered ? "достатньо" : "недостатньо");
    }
}