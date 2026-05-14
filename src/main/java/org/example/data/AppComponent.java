package org.example.data;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {
    ComputerBuilder getComputerBuilder();
    SpecsReport getSpecsReport();
}