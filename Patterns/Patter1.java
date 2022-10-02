package Patterns;

public class Patter1 {
    public static void main(String[] args) {
      pattern4(5);
    }

    static void pattern1(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col = 1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n)
    {
        for (int row = 1;row<=n;row++)
        {
            for(int col = 1; col<=n+1-row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col = 1;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n)
    {
       for (int row = 0;row< 2 * n;row++)
       {
           int total = row > n ? 2 * n - row : row;
           for(int col = 0; col< total ; col++)
           {
               System.out.print("* ");
           }
           System.out.println();
       }

    }
}
