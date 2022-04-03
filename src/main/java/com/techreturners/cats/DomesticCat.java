package com.techreturners.cats;

public class DomesticCat implements Cat {

    private final String setting = "domestic";
    private final int averageHeight = 23;

    private boolean isAsleep;

    @Override
    public void goToSleep() {
        isAsleep = true;
    }

    @Override
    public String eat() {
        return "Purrrrrrr";
    }

    public void wakeUp(){
        isAsleep = false;
    }

    @Override
    public void run() {

    }

    @Override
    public boolean isAsleep() {
        return isAsleep;
    }

    @Override
    public int getAverageHeight() {
        return averageHeight;
    }

    @Override
    public String getSetting() {
        return setting;
    }


}
