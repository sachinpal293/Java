package com.string;

public class Dice_custome_faces {
    public static void main(String[] args) {

        Diceface("",4,8);
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
