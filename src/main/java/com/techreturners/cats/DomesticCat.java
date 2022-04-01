package com.techreturners.cats;

public class DomesticCat extends Cat {

    public DomesticCat() {
        super();
    }
    public DomesticCat(String setting, int averageHeight) {
        super(setting, averageHeight);
    }

    @Override
    public String eat() {
        return null;
    }
}
