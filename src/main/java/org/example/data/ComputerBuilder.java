package org.example.data;

import javax.inject.Inject;

public class ComputerBuilder {
    private final Computer computer;
    private final Storage storage;
    private final GPU gpu;

    @Inject
    public ComputerBuilder(Computer computer, Storage storage, GPU gpu) {
        this.computer = computer;
        this.storage = storage;
        this.gpu = gpu;
    }

    public void buildAndTest() {
        System.out.println("\n>>> Збірка комп'ютера...");
        computer.printSpecs();
        System.out.println("\n>>> Тест GPU:");
        System.out.println(gpu.render("3D сцена в 4K"));
        System.out.println("\n>>> Тест Storage:");
        storage.save("benchmark_results.dat");
        System.out.println("[Storage] Доступно: " + storage.getCapacity() + " GB");
        System.out.println("\n>>> Збірка завершена успішно!");
    }
}