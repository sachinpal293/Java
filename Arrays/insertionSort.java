package com.Arrays;

public class insertionSort {
    public static void main(String[] args) {
      int [] a = {8,4,1,5,9,2,6};
      insert(a);
    }
    static void insert(int[] arr)
    {
        for(int i = 1;i< arr.length;i++)
        {
            int temp = arr[i];
            int key = i-1;
            for(;key>=0;key--)
            {
                if(arr[key]>temp)
                {
                  arr[key+1] = arr[key];
                }else{
                    break;
                }
            }

            arr[key+1] = temp;
        }

        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
