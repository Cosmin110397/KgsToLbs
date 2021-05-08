package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double mass;
        System.out.println("Kgs: ");
        Scanner greutate = new Scanner(System.in);
        mass =greutate.nextDouble();
        double lbsConverted;
        lbsConverted = mass * 2.20462262;
        System.out.println("Lbs: " + lbsConverted);

    }
}
