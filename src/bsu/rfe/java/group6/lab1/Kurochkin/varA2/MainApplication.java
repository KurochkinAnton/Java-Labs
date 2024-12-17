package bsu.rfe.java.group6.lab1.Kurochkin.varA2;

public class MainApplication {
    public MainApplication() {
    }

    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int cheeseCount = 0;
        int appleCount = 0;
        int pieCount = 0;
        int teaCount = 0;

        for(int itemIndex = 0; itemIndex < args.length; ++itemIndex) {
            String[] parts = args[itemIndex].split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemIndex] = new Cheese();
                ++cheeseCount;
            } else if (parts[0].equals("Apple")) {
                breakfast[itemIndex] = new Apple(parts[1]);
                ++appleCount;
            } else if (parts[0].equals("Pie")) {
                breakfast[itemIndex] = new Pie(parts[1]);
                ++pieCount;
            } else if (parts[0].equals("Tea")) {
                breakfast[itemIndex] = new Tea();
                ++teaCount;
            }
        }

        Food[] var10 = breakfast;
        int var11 = breakfast.length;

        for(int var8 = 0; var8 < var11; ++var8) {
            Food item = var10[var8];
            if (item == null) {
                break;
            }

            item.consume();
        }

        System.out.println("Количество яблок: " + appleCount);
        System.out.println("Количество сыра: " + cheeseCount);
        System.out.println("Количество кусочков пирога: " + pieCount);
        System.out.println("Количество выпитых кружек чая: " + teaCount);
    }
}
