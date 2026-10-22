package com.example.marvelsentryvoid.gui;

import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;

public class SentryScreenHandler extends ScreenHandler {
    protected SentryScreenHandler(ScreenHandlerType<?> type, int syncId) {
        super(type, syncId);
    }

    @Override
    public boolean canUse() {
        return true;
    }
}