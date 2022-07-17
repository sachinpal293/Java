package com.company;

public class Reverse_binary {
    public static void main(String[] args) {

        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(revers(arr,6,0,arr.length));
    }

    static int revers(int[] arr, int target,int s, int e)
    {
        if(s>e)
        {
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[s]<=arr[mid])
        {
            if(target>=arr[s]&& target<=arr[mid]){
                return revers(arr,target,s, mid-1);
            }
            else
            {
                return revers(arr,target,mid+1,e);
            }
        }
        if(target>=arr[mid]&&target <=arr[e])
        {
            return revers(arr,target,mid+1,e);
        }

        return revers(arr,target,s,mid-1);
    }
}
