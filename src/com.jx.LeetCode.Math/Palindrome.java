package com.jx.LeetCode.Math;

/**
 * Created by jx on 15/10/10.
 */
public class Palindrome {
    /**
     * judge whether an Integer is palindrome.
     * ps:don't use extra space
     * @param x an integer
     * @return
     */
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int result=0,y=x;
        while(y!=0){
            result=result*10+y%10;
            y=y/10;
        }
        return (x==result);
    }

    public static void main(String[] args) {
        Palindrome palindrome=new Palindrome();
        System.out.println(palindrome.isPalindrome(1211));
    }
}
