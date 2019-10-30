public class Solution {
    public int cutRope(int target) {
        int[] cut=new int[60];
        cut[1]=1;
        cut[2]=1;
        for(int x=3;x<=target;x++)
        {
            int maxcut=0;
            for(int y=2;y<x;y++)
            {
                maxcut=(cut[y]*cut[x-y]>maxcut)? (cut[y]*cut[x-y]):maxcut;
                maxcut=(y*cut[x-y]>maxcut)? (y*cut[x-y]):maxcut;
                maxcut=(y*(x-y)>maxcut)? (y*(x-y)):maxcut;
                maxcut=(cut[y]*(x-y)>maxcut)? (cut[y]*(x-y)):maxcut;
            }
            cut[x]=maxcut;
        }
        return cut[target];
    }
}