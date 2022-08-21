package com.Arrays;

public class Array_travers {
    public static void main(String[] args) {

        int[] a = {10,20,30,40,50};
        int[][] b = {{10,20,50,60},{10,20,30}};
        int[][][] c = {{{10,20},{30,40,50}},{{60,70,80},{90,100}}};
        System.out.println(a.length);
//        single_dimension_array(a);
//        double_dimension_array(b);
//        Multiple_dimension_array(c);
    }
    static void single_dimension_array(int[] array)
    {
        System.out.println("The Elements are present in the array are following: ");
        for(int i =0;i<array.length;i++)
        {
            System.out.print(" "+array[i]);
        }
        System.out.println();
    }

    static void double_dimension_array(int[][] array)
    {
        System.out.println("The Elements are present in the Mutli-dimension(2) array are following: ");
        for(int i = 0;i< array.length;i++)
        {
            for(int j = 0;j<array[i].length;j++)
            {
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
    }

    static void Multiple_dimension_array(int[][][] array)
    {
        System.out.println("The Elements are present in the Mulit-dimension(3) array are following: ");
        for(int i = 0;i<array.length;i++)
        {
            for(int j = 0;j<array[i].length;j++)
            {
                for (int k = 0;k<array[i][j].length;k++)
                {
                    System.out.print(" "+array[i][j][k]);
                }
                System.out.println();
            }

        }
    }

}
