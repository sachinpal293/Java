package com.Backtracking;

import java.util.ArrayList;

public class Maze_path_list {
    public static void main(String[] args) {

        System.out.println(pathlist("",3,3));
    }
    static ArrayList<String> pathlist(String p, int r, int c)
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
            list.addAll(pathlist(p+'V',r-1,c));
        }
        if(c>1)
        {
            list.addAll(pathlist(p+'H',r,c-1));
        }

        return list;
    }

}
