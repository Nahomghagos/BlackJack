package com.pluralsight;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("please enter the first player name ");
        String firstName = myScanner.nextLine();
        System.out.println("please enter second player name ");
        String secondName = myScanner.nextLine();

        Hand hand = new Hand();
        Deck deck = new Deck();
        Card card = new Card( firstName ,secondName);;





    }
}
