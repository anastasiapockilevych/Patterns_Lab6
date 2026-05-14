package org.example.data;

import javax.inject.Inject;

public class GPU {
    private final String model = "NVIDIA RTX 4090";
    private final int vram = 24;

    @Inject
    public GPU() {}

    public int getVram() { return vram; }

    public String getInfo() {
        return String.format("[GPU] %s | VRAM: %d GB", model, vram);
    }

    public String render(String scene) {
        return String.format("[GPU] Рендеринг '%s' з %d GB VRAM", scene, vram);
    }
}