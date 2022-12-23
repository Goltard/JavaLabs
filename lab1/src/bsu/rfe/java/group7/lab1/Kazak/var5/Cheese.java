package bsu.rfe.java.group7.lab1.Kazak.var5;

public class Cheese extends Food implements Consumable{
    public Cheese() {
        super("Сыр");
    }
    public String toString() {
        return this.getClass().getSimpleName() ;
    }
}
