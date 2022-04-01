package com.techreturners.cats;

public abstract class Cat {

    private boolean asleep;
    private int averageHeight;
    private String setting;

    public Cat(String setting,int averageHeight){
        this.asleep = false;
        this.setting = setting;
        this.averageHeight = averageHeight;
    }

    public Cat() {

    }

    public int getAverageHeight() {
        return this.averageHeight;
    }
    public abstract String eat();

    public boolean isAsleep() {
        return this.isAsleep();
    }

    public String getSetting(){
        return this.setting;

    }

}
