package bsu.rfe.java.group7.lab1.Kazak.var5;

import java.util.Objects;

public abstract class Food implements Consumable {
    protected String name;

    public Food() {
    }

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void consume() {

        System.out.println(this + " съеден");
    }

    @Override
    public boolean equals(Object o) {

        String firstType = this.getClass().getSimpleName();
        String secondType = (String)o;

        return firstType.equals(secondType);
    }


}
