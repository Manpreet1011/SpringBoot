package com.manpreet.springDemo;

public class SpreadOperator {
    public static void main(String... args) {
        PrintString(1,"a","b","c","d");
    }
    public static void PrintString(int n,String ... arr)
    {
        for(String s: arr)
            System.out.println(s);
    }
}
