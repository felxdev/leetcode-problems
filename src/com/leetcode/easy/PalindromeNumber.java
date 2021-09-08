package com.leetcode.easy;

/**Reverse Integer
Description
Given a 32-bit signed integer, reverse digits of an integer.

 Example 1:

 Input: 121
 Output: true
 Example 2:

 Input: -121
 Output: false
 Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 Example 3:

 Input: 10
 Output: false
 Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 Follow up:
*/

public class PalindromeNumber {

    public static int acc;
    
    public static boolean reverseInteger(int n){
        if(n==0 || n<0){
            return false;
        }
        int temp = n % 10;
        acc = acc * 10 + temp;
        reverseInteger(n/10);

        return acc == n;
    }

    public static void main(String[] args) {
        reverseInteger(123);
    }
}
