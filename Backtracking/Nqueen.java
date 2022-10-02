package com.Backtracking;

public class Nqueen {
    public static void main(String[] args) {

        int n = 5;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0));
        System.out.println(board.length);
    }
    static int queens(boolean[][] board, int row)
    {
        if(row== board.length)
        {
            disply(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        // placing the queen and check for every row and column
        for(int col = 0;col<board.length;col++)
        {
            // place the queen if it is safe
            if(issafe(board,row,col))
            {
                board[row][col] = true;
                count+=queens(board,row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean issafe(boolean[][] board, int row, int col)
    {
        for(int i = 0;i<row;i++)
        {
            if(board[i][col])
            {
                return false;
            }
        }

        // diagonal left
        int maxleft = Math.min(row,col);
        for(int i = 1;i<=maxleft;i++)
        {
            if(board[row-i][col-i])
            {
                return false;
            }
        }

        // diagonal right
        int maxright = Math.min(row,board.length-col-1);
        for(int i = 1;i<=maxright;i++)
        {
            if(board[row-i][col+i])
            {
                return false;
            }
        }
        return true;
    }
    private static void disply(boolean[][] board)
    {
        for(boolean[] row:board)
        {
            for(boolean element:row)
            {
                if(element)
                {
                    System.out.print("Q ");
                }
                else
                {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
