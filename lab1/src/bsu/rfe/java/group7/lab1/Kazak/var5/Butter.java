package bsu.rfe.java.group7.lab1.Kazak.var5;

public class Butter extends Food implements Consumable{
    public Butter() {
        super("Масло");
    }
    public String toString() {
        return this.getClass().getSimpleName() ;
    }
}
