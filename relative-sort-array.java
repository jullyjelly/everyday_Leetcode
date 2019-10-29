import java.util.*;
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.parallelSort(arr1);
        int[] arr=new int[arr1.length];
        int pos=0;
        int posend=arr1.length-1;
        int[] num=new int[arr1.length];
        for(int x=0;x<arr2.length;x++)
        {
            for(int y=0;y<arr1.length;y++)
            {
                if(arr2[x]==arr1[y])
                {
                    arr[pos++]=arr1[y];
                    num[y]++;
                }
            }
        }
        for(int x=0;x<arr1.length;x++)
        {
            if(num[x]==0)
                arr[pos++]=arr1[x];
        }
        return arr;
    }
}