package com.leetcode.easy;

/**Reverse Integer
Description
Given a 32-bit signed integer, reverse digits of an integer.

Input: 123
Output:  321
Example 2:

Input: -123
Output: -321

Input: 120
Output: 21
Note:

Assume we are dealing with an environment which could only hold integers within the 32-bit signed
 integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.*/
public class ReverseInteger {

    public static int acc;
    
    public static int reverseInteger(int n){
        if(n==0){
            return n;
        }
        int temp = n % 10;
        acc = acc * 10 + temp;
        reverseInteger(n/10);

        return acc;
    }

    public static void main(String[] args) {
        reverseInteger(123);
    }
}
