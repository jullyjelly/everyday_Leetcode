//https://leetcode-cn.com/problems/distance-between-bus-stops/
//import java.lang.*;
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum1=0;
        int sum2;
        int temp;
        //int startnew;
        //int destinationnew;
        //startnew=Math.min(destination,start);
        //destinationnew=Math.max(destination,start);
        if(start>destination)
        {
            temp=start;
            start=destination;
            destination=temp;   
        }
        for(int x=start;x<destination;x++)
        {
            sum1+=distance[x];
        }
        int sum=0;
        for(int x=0;x<distance.length;x++)
        {
            sum+=distance[x];
        }
        sum2=sum-sum1;
        if(sum2>sum1)
            return sum1;
        else 
            return sum2;
    }
}