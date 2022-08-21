package com.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] a = {38,52,9,18,6,62,13};
        sel_sort(a);
    }
    static void sel_sort(int[] arr)
    {
        int min = 0,temp =0;
        for(int i = 0;i<arr.length;i++)
        {
            min = i;
            for(int j = i+1;j< arr.length;j++)
            {

                if(arr[min]>arr[j])
                {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
    }
}
