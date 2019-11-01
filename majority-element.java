class Solution {
    public int majorityElement(int[] nums) {
        //复杂解法
        // for(int x=0;x<n;x++)
        // {
        //     int count=0;
        //     for(int y=0;y<n;y++)
        //     {
        //         if(nums[x]==nums[y])
        //         {
        //             count+=1;
        //             if(count>n/2)
        //                 return nums[x];
        //         }
        //     }
        // }
        // return -1;
        //简单解法
        Arrays.parallelSort(nums);
        return nums[nums.length/2];
    }
}