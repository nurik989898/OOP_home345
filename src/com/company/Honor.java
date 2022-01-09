package com.company;

public class Honor extends Phone {
    private String design;

    public Honor(String design) {
        this.design = design;
    }


    @Override
    public void print() {
        System.out.println(design + " New edition");
        return;
    }
}

