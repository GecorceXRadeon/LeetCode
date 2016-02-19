package com.test;

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        char patterns[] = pattern.toCharArray();
        String strs[] = str.split(" ");
        
        if(patterns.length != strs.length) return false;
        if(patterns.length == 1) return true;
        
        boolean flag = true;
        
        for(int i = 0; i < patterns.length - 1; ++i){
            for(int j = 1; j < patterns.length; ++j){
                flag = patterns[i] == patterns[j] ?
                            strs[i].equals(strs[j]) :
                            !strs[i].equals(strs[j]);
                if( flag == false) return false;
            }
        }
        
        return true;
    }
}

