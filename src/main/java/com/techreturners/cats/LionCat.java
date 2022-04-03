package com.techreturners.cats;

public class LionCat extends WildCat {

    public LionCat(){
        super();
        this.averageHeight = 1100;
    }


    @Override
    public String eat() {
        return "Roar!!!!";
    }


}
