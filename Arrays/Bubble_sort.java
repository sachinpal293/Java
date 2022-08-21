package com.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
    int[] array = {38,52,9,18,6,62,13};
//        System.out.println(array.length);
//    sort(array);


    }
    static void sort(int[] arr)
    {

        int temp = 0;
        for(int i = 0;i<arr.length;i++)
        {
            int flag = 0;
            for(int j = 0;j<=3;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if(flag==0)
            {
                break;
            }
        }

        for (int a: arr)
        {
            System.out.println(a);
        }
    }


}
