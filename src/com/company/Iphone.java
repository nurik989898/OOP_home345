package com.company;

public class Iphone extends Phone {
    private String typeOfFrame;

    public Iphone(String typeOfFrame) {
        this.typeOfFrame = typeOfFrame;
    }

    @Override
    public void print() {
        System.out.println(typeOfFrame + " avalnii");
         return;
    }
}
