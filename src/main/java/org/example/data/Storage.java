package org.example.data;

import javax.inject.Inject;

public class Storage {
    private final String model = "Samsung 990 Pro NVMe";
    private final int capacity = 2000;
    private final int readSpeed = 7450;

    @Inject
    public Storage() {}

    public int getCapacity() { return capacity; }

    public String getInfo() {
        return String.format("[Storage] %s | %d GB | Читання: %d MB/s",
                model, capacity, readSpeed);
    }

    public void save(String data) {
        System.out.println("[Storage] Запис даних: " + data);
    }
}