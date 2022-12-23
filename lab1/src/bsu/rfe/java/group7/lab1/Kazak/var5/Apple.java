package bsu.rfe.java.group7.lab1.Kazak.var5;

public class Apple extends Food {

    public Apple() {
    }

    public Apple(String size) {
        super(size);

    }

    public String toString() {
        if(name != null)
            return this.getClass().getSimpleName() + " размера '" + name.toUpperCase() + "'";
        return this.getClass().getSimpleName();
    }
}
