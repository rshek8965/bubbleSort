package com.company;

public class bubble {
    public static void bubbleSwap(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }

}
