package com.example.btaprecycleview;

public class Fruit {
    private String name;
    private String desc;
    private int image;

    public Fruit(String name, String desc, int image) {
        this.name = name;
        this.desc = desc;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage() {
        return image;
    }
}

