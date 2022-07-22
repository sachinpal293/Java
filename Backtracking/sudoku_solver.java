package com.Backtracking;

public class sudoku_solver {
    public static void main(String[] args) {

        int[][] board = new int[][]{
                {3,0,6,5,0,8,4,0,0},
                {5,2,0,0,0,0,0,0,0},
                {0,8,7,0,0,0,0,3,1},
                {0,0,3,0,1,0,0,8,0},
                {9,0,0,8,6,3,0,0,5},
                {0,5,0,0,9,0,6,0,0},
                {1,3,0,0,0,0,2,5,0},
                {0,0,0,0,0,0,0,7,4},
                {0,0,5,2,0,6,3,0,0}
        };

        System.out.println(solve(board));

        if(solve(board))
        {
            display(board);
            System.out.println(solve(board));
        }
        else System.out.println("cant not solve");
    }
    static boolean solve(int[][] board)
    {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        // this how we are replaceing the r, c, from argument
        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(board[i][j] == 0)
                {
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }

            // if you found some empty elements in row, then break
            if(emptyLeft==false)
            {
                break;
            }
        }
        if(emptyLeft== true)
        {
            return true;
        }
        // backtrack
        for(int number = 1; number<=9;number++)
        {
            if(issafe(board, row, col, number))
            {
                board[row][col] = number;
                if(solve(board))
                {
                    // found the answer
//                    display(board);
                    return true;
                }
                else
                {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
    private static void display(int[][] board)
    {
        for(int[] row:board)
        {
            for(int number:row)
            {
                System.out.print(number+" ");
            }
            System.out.println();
        }
    }
    static boolean issafe(int[][] board, int row, int col, int num)
    {
        // check the row
        for(int i = 0;i<board.length;i++)
        {
            // check if the number is the row
            if(board[row][col] == num)
            {
                return false;
            }
        }
        // check for the col
        for(int[] nums:board)
        {
            // check if the number is in the row
            if(nums[col] == num)
            {
                return false;
            }
        }

        int sqr = (int)(Math.sqrt(board.length));
        int rowstart = row - row%sqr;
        int colstart = col - col%sqr;

        for(int r = rowstart;r<rowstart+sqr;r++)
        {
            for(int c = colstart;c<colstart+sqr;c++)
            {
                if(board[r][c]==num)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
