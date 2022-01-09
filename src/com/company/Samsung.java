package com.company;

public class Samsung extends Phone{
    private String model;

    public Samsung(String model) {
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println(model + " Galaxy S101");
        return;
    }
}
