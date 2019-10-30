public class Solution {
    public int JumpFloorII(int target) {
        int[] step=new int[target];
        int sum=0;
        for(int x=0;x<target;x++)
        {
            for(int y=0;y<x;y++)
            {
                step[x]=step[x]+step[y];
            }
            sum=step[x]+1;
            step[x]=sum;
        }
        return sum;
    }
}