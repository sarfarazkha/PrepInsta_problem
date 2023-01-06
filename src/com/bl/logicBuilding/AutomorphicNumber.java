package com.bl.logicBuilding;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int n = sc.nextInt(), sq = n * n ;
        if(isAutomorphic(n) == 1)
            System.out.println("Num: "+ n + ", Square: " + sq + " - is Automorphic");
        else
            System.out.println("Num: "+ n + ", Square: " + sq + " - is not Automorphic");
    }
    static int isAutomorphic(int n){
        int square = n * n;
        while(n != 0)
        {
            if(n % 10 != square % 10){
                return 0;
            }
            // reduce down numbers
            n /= 10;
            square /= 10;
        }
        // if reaches here means automorphic number
        return 1;
    }
}
