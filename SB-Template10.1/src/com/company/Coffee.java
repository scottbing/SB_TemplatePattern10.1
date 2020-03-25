package com.company;

public class Coffee extends CaffeinatedBeverage{

    // all of the drinks start out witha gradual heating process
    @Override
    void brewBeverage() {
        System.out.println("Dripping coffee through filter.");
    }

    // the hooks - eliminate the extras that are not wanted
    @Override
    boolean wantsLemon() {
        return false;
    }

    @Override
    boolean wantsSugar() {
        return false;
    }


}

