package com.string;

import java.util.ArrayList;

public class Phone_pad_list {
    public static void main(String[] args) {

        System.out.println(padret("","12"));
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
}
