package org.example.data;

import javax.inject.Inject;

public class BenchmarkService {
    private final CPU cpu;
    private final GPU gpu;
    private final Storage storage;

    @Inject
    public BenchmarkService(CPU cpu, GPU gpu, Storage storage) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.storage = storage;
    }

    public int runCpuBenchmark() {
        int score = cpu.getCores() * (int)(cpu.getFrequency() * 1000);
        System.out.println("[BenchmarkService] CPU Score: " + score);
        return score;
    }

    public int runGpuBenchmark() {
        int score = gpu.getVram() * 4200;
        System.out.println("[BenchmarkService] GPU Score: " + score);
        return score;
    }

    public int runStorageBenchmark() {
        int score = storage.getCapacity() * 3;
        System.out.println("[BenchmarkService] Storage Score: " + score);
        return score;
    }

    public int runFullBenchmark() {
        int total = runCpuBenchmark() + runGpuBenchmark() + runStorageBenchmark();
        System.out.println("[BenchmarkService] Загальний Score: " + total);
        return total;
    }
}