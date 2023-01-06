package com.bl.logicBuilding;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Factors of " + num + " are ");

        // finding and printing factors b/w 1 to num
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                System.out.println(i + " ");
        }
    }
}
