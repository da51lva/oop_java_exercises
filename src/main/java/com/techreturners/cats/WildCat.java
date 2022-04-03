package com.techreturners.cats;

public abstract class WildCat implements Cat{

    private final String setting = "wild";

    private boolean isAsleep;
    protected int averageHeight;

    @Override
    public void goToSleep() {
        isAsleep = true;
    }

    public void wakeUp(){
        isAsleep = false;
    }

    @Override
    public void run() {

    }

    public boolean isAsleep() {
        return isAsleep;
    }

    public int getAverageHeight() {
        return averageHeight;
    }

    public String getSetting() {
        return setting;
    }

}
