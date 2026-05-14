package org.example.data;

import javax.inject.Inject;

public class Computer {
    private final Motherboard motherboard;
    private final ComputerCase computerCase;
    private final CoolingSystem coolingSystem;

    @Inject
    public Computer(Motherboard motherboard,
                    ComputerCase computerCase,
                    CoolingSystem coolingSystem) {
        this.motherboard = motherboard;
        this.computerCase = computerCase;
        this.coolingSystem = coolingSystem;
    }

    public void printSpecs() {
        System.out.println("\n========= СПЕЦИФІКАЦІЯ ПК =========");
        System.out.println(motherboard.getInfo());
        System.out.println(computerCase.getInfo());
        System.out.println(coolingSystem.getInfo());
        System.out.println("Сумісність: " + (motherboard.isCompatible() ? "OK" : "ПОМИЛКА"));
        System.out.println("Швидкість вентилятора: " + coolingSystem.getFanSpeed() + " RPM");
        System.out.println("====================================");
    }
}