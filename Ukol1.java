package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ukol1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej číslo :");
        int a = sc.nextInt();

        if (a % 7 == 0) {
            System.out.println("Číslo " + a + " je dělitelné 7.");
        }else{
            System.out.println("Číslo " + a + " není dělitelné 7.");
        }
    }
}
