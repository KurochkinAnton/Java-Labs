
package bsu.rfe.java.group6.lab1.Kurochkin.varA2;

public abstract class Food implements Consumable {
    String name = null;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void consume() {
    }

    public String toString() {
        return this.name;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Food)) {
            return false;
        } else {
            return this.name != null && ((Food)obj).name != null ? this.name.equals(((Food)obj).name) : false;
        }
    }
}
