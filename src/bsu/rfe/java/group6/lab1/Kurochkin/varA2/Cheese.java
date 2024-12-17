package bsu.rfe.java.group6.lab1.Kurochkin.varA2;

public class Cheese extends Food {
    public Cheese() {
        super("Сыр");
    }

    public void consume() {
        System.out.println(String.valueOf(this) + " сьеден ");
    }
}
