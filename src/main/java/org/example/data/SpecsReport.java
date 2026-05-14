package org.example.data;

import javax.inject.Inject;

public class SpecsReport {
    private final BenchmarkService benchmarkService;
    private final PriceCalculator priceCalculator;
    private final Monitor monitor;
    private final Keyboard keyboard;
    private final Mouse mouse;

    @Inject
    public SpecsReport(BenchmarkService benchmarkService,
                       PriceCalculator priceCalculator,
                       Monitor monitor,
                       Keyboard keyboard,
                       Mouse mouse) {
        this.benchmarkService = benchmarkService;
        this.priceCalculator = priceCalculator;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void printFullReport() {
        System.out.println("\n========= ПОВНИЙ ЗВІТ =========");
        System.out.println("--- Периферія ---");
        System.out.println(monitor.getInfo());
        System.out.println(keyboard.getInfo());
        System.out.println(mouse.getInfo());
        System.out.println("\n--- Бенчмарки ---");
        benchmarkService.runFullBenchmark();
        System.out.println("\n--- Ціна ---");
        System.out.println(priceCalculator.getPriceBreakdown());
        System.out.println("================================");
    }

    public void printPeripheralCompatibility() {
        System.out.println("\n--- Сумісність периферії ---");
        System.out.println("Монітор " + monitor.getResolution() + "p @ " +
                monitor.getRefreshRate() + "Hz — " +
                (monitor.getRefreshRate() >= 144 ? "Підходить для ігор" : "Офісний варіант"));
        System.out.println("Клавіатура бездротова: " + (keyboard.isWireless() ? "Так" : "Ні"));
        System.out.println("Миша бездротова: " + (mouse.isWireless() ? "Так" : "Ні"));
        System.out.println("Точність миші: " + mouse.getDpi() + " DPI — " +
                (mouse.getDpi() > 20000 ? "Pro рівень" : "Стандарт"));
    }
}