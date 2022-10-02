package com.Backtracking;

import java.util.ArrayList;

public class Maze_Diagonal {
    public static void main(String[] args) {

        System.out.println(pathlistdiagnol("",3,3));
    }

    static ArrayList<String> pathlistdiagnol(String p, int r, int c)
    {
        if(r==1 && c==1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1)
        {
            list.addAll(pathlistdiagnol(p+'V',r-1,c));
        }
        if(c>1)
        {
            list.addAll(pathlistdiagnol(p+'H',r,c-1));
        }
        if(r>1 & c>1)
        {
            list.addAll(pathlistdiagnol(p+'D',r-1,c-1));
        }

        return list;
    }
}
