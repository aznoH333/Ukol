package com.company;

import java.util.LinkedList;

public class Ukol2 {
    public static void main(String[] args) {


        boolean res = true;

        for (int i = 2;i < 100;i++) {
            res = true;

            for (int j = 2; j < i-1; j++) {
                if(i % j == 0){
                    res = false;
                }
            }

            if (res == true) {
                System.out.println(i);
            }
        }
    }
}
