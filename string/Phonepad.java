package com.string;

import java.util.ArrayList;

public class Phonepad {
    public static void main(String[] args) {
        System.out.println(padret("","123"));
        System.out.println(padcount("","123"));
    }

    static  void pad(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0)-'0';
        for(int i = (digit-1)*3;i<digit*3;i++)
        {
          char ch = (char)('a'+i);

          pad(p+ch,up.substring(1));
        }
    }


    static ArrayList<String> padret(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0)-'0';

        ArrayList<String> list = new ArrayList<>();
        for(int i = (digit-1)*3;i<digit*3;i++)
        {
            char ch = (char)('a'+i);

            list.addAll(padret(p+ch,up.substring(1)));
        }

        return list;
    }

    static  int padcount(String p, String up)
    {
        if(up.isEmpty())
        {
            return 1;
        }
         int count = 0;
        int digit = up.charAt(0)-'0';
        for(int i = (digit-1)*3;i<digit*3;i++)
        {
            char ch = (char)('a'+i);

            count = count+padcount(p+ch,up.substring(1));
        }
        return count;
    }

}
