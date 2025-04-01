package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;
    // Конструктор по умолчанию
    public Tester() {
        this("Безымянный", "Бесфамильный", 0, "A1", 0.0);
        System.out.println("Конструктор по умолчанию");
    }

    // Конструктор с тремя параметрами
    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "A2", 50000.0);
        System.out.println("Конструктор с тремя параметрами");
    }

    // Конструктор с пятью параметрами
    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
        System.out.println("Конструктор с пятью параметрами");
    }
    public void displayInfo() {
        System.out.println("Имя: " + name + ", Фамилия: " + surname);
    }

    public void displayInfo(String additionalInfo) {
        System.out.println("Имя: " + name + ", Фамилия: " + surname + ", Дополнительно: " + additionalInfo);
    }

    public void displayInfo(int years) {
        System.out.println(name + " работает тестировщиком уже " + years + " лет.");
    }


    public static void displayWelcomeMessage() {
        System.out.println("Добро пожаловать в команду тестировщиков!");
    }

}
