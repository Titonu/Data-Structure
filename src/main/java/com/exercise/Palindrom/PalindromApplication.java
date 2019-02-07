package com.exercise.Palindrom;

public class PalindromApplication {
    private static boolean isPalindrom(char[] words){
        int i = 0;
        int j = words.length - 1;
        while (i < j){
            System.out.println("i :"+ words[i] +" j: "+words[j]);
            if (words[i] != words[j]) {
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }

    public static void main(String[] args) {
    String input = "bisib";
    char[] inputArr = input.toCharArray();
        System.out.println("is Palindrom: "+isPalindrom(inputArr));
    }
}
