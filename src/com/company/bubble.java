package com.company;

public class bubble {
    public static void bubbleSwap(int[] arr) {
        for(int k = 0; k < arr.length; k++)
        {
            for (int i=0; i<arr.length-1; i++)
            {
                if (arr[i] > arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
}
