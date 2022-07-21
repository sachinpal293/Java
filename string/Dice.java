package com.string;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {

//        Dicecount("",4);

    }

    static void Dicecount(String p, int target)
    {
        if(target==0)
        {
            System.out.println(p);
            return;
        }

        for(int i = 1;i<=6&&i<=target;i++)
        {
            Dicecount(p+i,target-i);
        }
    }



    static void Diceface(String p, int target, int face)
    {
        if(target==0)
        {
            System.out.println(p);
            return;
        }

        for(int i = 1;i<= face &&i<=target;i++)
        {
            Diceface(p+i,target-i,face);
        }
    }
}
