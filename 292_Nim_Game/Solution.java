package com.test;

public class Solution {
    public boolean canWinNim(int n) {
        if( n == 1 || n == 2 || n == 3) return true;
        return n % 4 == 0 ? false : true;
    }
}	
