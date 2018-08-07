package com.alevel.hometask.oop2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите одно из веществ: water, iron, oxygen?");
        Substance s = null;
        while (s == null) {
            String input = scanner.nextLine().trim().toLowerCase();
            switch (input) {
                case "water":
                    s = new Water();
                    break;
                case "iron":
                    s = new Iron();
                    break;
                case "oxygen":
                    s = new Oxygen();
                    break;
            }
        }

        double t;
        System.out.println("Введите значение температуры:");
        do {
            t = scanner.nextDouble();
            State state = s.heatUp(t);
            double currentTemp = s.getTemperature();
            System.out.println("Вещество нагревалось на " + t + " градуса(ов)");
            System.out.println("Его агрегатное состяние " + state + " и сейчас его температура " + currentTemp);
        } while (t != 0);
    }
}