package bsu.rfe.java.group6.lab1.Kurochkin.varA2;

public class Pie extends Food {
    private String filling = null;

    public Pie(String filling) {
        super("Пирог");
        this.filling = filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public String getFilling() {
        return this.filling;
    }

    public void consume() {
        System.out.println(String.valueOf(this) + " сьеден");
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + " с начинкой '" + this.filling.toUpperCase() + "'";
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return !(obj instanceof Pie) ? false : this.filling.equals(((Pie)obj).filling);
        } else {
            return false;
        }
    }
}
