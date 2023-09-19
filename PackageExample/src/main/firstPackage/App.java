package main.firstPackage;

import java.util.Scanner;

public class App {
    public static void main(String[] agrs){


        System.out.print("Input your username: ");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();

        var greeting = User.getGreeting(userName);
        System.out.println(greeting);

    }

}
