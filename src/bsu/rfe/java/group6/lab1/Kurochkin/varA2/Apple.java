package bsu.rfe.java.group6.lab1.Kurochkin.varA2;

public class Apple extends Food {
    private String size = null;

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Apple(String size) {
        super("Яблоко");
        this.size = size;
    }

    public void consume() {
        System.out.println(String.valueOf(this) + " сьедено ");
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + " размера '" + this.size.toUpperCase() + "'";
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return !(obj instanceof Apple) ? false : this.size.equals(((Apple)obj).size);
        } else {
            return false;
        }
    }
}
