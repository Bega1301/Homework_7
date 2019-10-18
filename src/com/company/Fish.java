package com.company;

public abstract class Fish {

    private int weight;
    private String name;
    private String ocean;

    public abstract void makeFood ();
    public  abstract void forSale ();

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOcean() {
        return ocean;
    }
    public void setOcean(String ocean) {
        this.ocean = ocean;
    }
}
