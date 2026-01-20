package com.example;
import java.util.*;

public class Activity2 {
    public static void main(String[] args) {
        int[] numArr = {10,77,10,54,-11,10};
        System.out.println("original array: " + Arrays.toString(numArr));

        int searchNum = 10;
        int fixedSum = 30;
        System.out.println("Result: " + result(numArr, searchNum, fixedSum));

    }
public static boolean result(int[] numbers, int searchNum, int fixedSum){
    int temp_Sum = 0;
    for (int number : numbers) {
        if (number == searchNum) {
            temp_Sum += searchNum;
        }

        if (temp_Sum > fixedSum) {
            break;
        }
    }
    return temp_Sum == fixedSum;
    }
}
