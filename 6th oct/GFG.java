/*
Program: Praogram to check a string is palindrome or not (lab assisment 2)
@author Sayantan Naskar
@date 6th oct 2022
*/

import java.util.Scanner;

class GFG {
    public static boolean isPalindrome(String str) {
       
        String rev = "";

        
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }

    public static void main(String[] args) {
       
        String str = "geeks";

        
        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
    }
}