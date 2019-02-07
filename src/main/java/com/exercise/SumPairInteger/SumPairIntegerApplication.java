package com.exercise.SumPairInteger;

public class SumPairIntegerApplication {
    private static void findSumPairInteger(int arr[], int exResult) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == exResult) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + exResult);
                }
            }
        }
    }
    public static void main(String[] args) {
        int input[] = {10, 7, 8, 9, 1, 5, 5};
        findSumPairInteger(input, 10);
    }

//        for (int i = 0; i < arr.length; i++){
//            for (int j = i+1; j < arr.length; i++){
//                dividedLength = (arr[j] - arr[i]);
//                if (dividedLength > maxDiv ){
//                    maxDiv = dividedLength;
//                }
//            }
//        }
}

