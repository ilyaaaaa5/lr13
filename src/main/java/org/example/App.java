package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Tester tester1 = new Tester();
        tester1.displayInfo();

        Tester tester2 = new Tester("Алексей", "Петров", 5);
        tester2.displayInfo("Сертифицированный специалист");

        Tester tester3 = new Tester("Марина", "Иванова", 8, "C2", 80000.0);
        tester3.displayInfo(8);

        // Вызов статического метода
        Tester.displayWelcomeMessage();
    }
}
