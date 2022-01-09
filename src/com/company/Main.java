package com.company;

public class Main {

    public static void main(String[] args) {
        Printable[] printables = {createObject("iphone"),
                createObject("samsung"),createObject("honor")};
        for (Printable printable: printables) {
            printable.print();
        }
        }

    public static Printable createObject(String classname){
        switch(classname) {
            case "iphone":
                Iphone iphone = new Iphone("very big");
                return iphone;
            case "samsung":
            Samsung samsung = new Samsung("S102");
                return samsung;
            case "honor":
            Honor honor = new Honor("luxury");
                return honor;

        }
        return null;
    }
}
