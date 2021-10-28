package com.company;

import com.company.Client;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Client Buyer[] = new Client[5];


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scan.nextLine();
        System.out.println("Enter INN:");
        long INN = scan.nextLong();
        Buyer[0] = new Client(name, INN);
        Buyer[1] = new Client();

        Buyer[1].setName("Alex G.");
        Buyer[1].setINN(123456789778l);

        System.out.println("Cheking 1");
        Buyer[0].Exception();
        System.out.println("End 1");
        System.out.println("Cheking 2");
        Buyer[1].Exception();
        System.out.println("End 2");

    }
}
