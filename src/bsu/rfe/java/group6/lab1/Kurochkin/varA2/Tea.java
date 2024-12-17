package bsu.rfe.java.group6.lab1.Kurochkin.varA2;

public class Tea extends Food {
    public Tea() {
        super("Чай");
    }

    public void consume() {
        System.out.println(String.valueOf(this) + " выпит");
    }
}
