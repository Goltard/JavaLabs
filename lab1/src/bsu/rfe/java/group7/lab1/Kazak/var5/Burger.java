package bsu.rfe.java.group7.lab1.Kazak.var5;


public class Burger extends Food {
    public Burger() {
    }

    public Burger(String size) {
        super(size);
    }

    // Переопределѐнная версия метода toString(), возвращающая не только название продукта, но и его размер
    public String toString() {
        if(name != null)
            return this.getClass().getSimpleName() + " размера '" + name.toUpperCase() + "'";
        return this.getClass().getSimpleName();
    }
}
