package org.example.presentation;

import org.example.data.AppComponent;
import org.example.data.ComputerBuilder;
import org.example.data.DaggerAppComponent;
import org.example.data.SpecsReport;

public class Main {
    public static void main(String[] args) {
        AppComponent component = DaggerAppComponent.create();

        ComputerBuilder builder = component.getComputerBuilder();
        builder.buildAndTest();

        SpecsReport report = component.getSpecsReport();
        report.printFullReport();
        report.printPeripheralCompatibility();
    }
}