package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input username");
        String username = scanner.nextLine();

        System.out.println("Please enter your favourite hobby");
        String hobby = scanner.nextLine();

        if (hobby.equals("drink")){
            System.out.println("Please input your ages");
            int age = Integer.parseInt(scanner.nextLine());
            if (age>=18){
                System.out.println(username + " is able to drink his fav drink.");
            }
            System.out.println(username + " isn't able to drink needs to wait more :D");
        }
    }
}
