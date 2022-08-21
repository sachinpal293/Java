package com.Arrays;

public class Anonymous_Array {
    public static void main(String[] args) {

        sum(new int[] {10,20,30});
        multi_sum(new int[][]{{10,20,30},{40,50}});
    }

    static void sum(int[] no)
    {
        int total = 0;
        for(int i : no)
        {
            total =total+i;
        }
        System.out.println("Sum of the array is : "+total);
    }

    static void multi_sum(int[][] no)
    {
        int total = 0;
        for(int i[]:no)
        {
//            System.out.println(i);
            for(int j :i)
            {
//                System.out.println(j);
                total = total+j;
            }
        }
        System.out.println("Sum of all elements are : "+total);
    }
}
