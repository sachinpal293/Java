package com.Backtracking;

import java.util.Arrays;

public class allpath_print_martix {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];
        allpathmatrix("",board,0,0,path, 1);
    }
    static void allpathmatrix(String p,boolean[][] maze,int r, int c, int[][] path , int step)
    {
        if(r== maze.length-1 && c == maze[0].length-1)
        {
            path[r][r] = step;
            for(int[] arr:path)
            {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c])
        {
            return;
        }
        // i am considering this block in my path
        maze[r][c]  = false;
        path[r][c] = step;
        if(r<maze.length-1)
        {
            allpathmatrix(p+'D',maze,r+1,c,path,step+1);
        }
        if(c<maze.length-1)
        {
            allpathmatrix(p+'R',maze,r,c+1,path,step+1);
        }
        if(r>0)
        {
            allpathmatrix(p+'U',maze,r-1,c,path,step+1);
        }
        if(c>0)
        {
            allpathmatrix(p+'L',maze,r,c-1,path,step+1);
        }

        // this line is where the function will be over before the function
        // gets removed, also remove the changes that were made by function
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
