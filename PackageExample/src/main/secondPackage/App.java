package main.secondPackage;

import main.firstPackage.User;

public class App {
    public static void main(String[] args) {
        // Теперь класс можно использовать, обратившись к нему по простому имени
        var greeting = User.getGreeting("John");
        System.out.println(greeting); // => Hello, John!
    }
}
