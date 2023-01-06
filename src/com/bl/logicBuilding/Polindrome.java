package com.bl.logicBuilding;

public class Polindrome {
    public static void main(String[] args) {
        //variables initialization
        int num = 12021, reverse = 0, reminder, temp;

        temp = num;
        //loop to find reverse number
        while (temp != 0) {
            reminder = temp % 10;
            reverse = reverse * 10 + reminder;
            temp /= 10;
        }
        // palindrome if num and reverse are equal
        if (num == reverse)
            System.out.println(num + " is Palindrome");
        else
            System.out.println(num + " is not Palindrome");
    }
}
