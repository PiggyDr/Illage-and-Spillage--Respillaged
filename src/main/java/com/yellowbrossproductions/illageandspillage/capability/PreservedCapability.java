package com.yellowbrossproductions.illageandspillage.capability;

public class PreservedCapability implements IPreserved {
    private boolean preserved;

    @Override
    public boolean isPreserved() {
        return this.preserved;
    }

    @Override
    public void setPreserved(boolean preserved) {
        this.preserved = preserved;
    }
}
