package com.string;

import java.util.ArrayList;

public class Dice_Arraylist {
    public static void main(String[] args) {
        System.out.println(Dicecountlist("",4));
    }
    static ArrayList<String> Dicecountlist(String p, int target)
    {
        if(target==0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1;i<=6&&i<=target;i++)
        {
            list.addAll(Dicecountlist(p+i,target-i));
        }
        return list;
    }
}
