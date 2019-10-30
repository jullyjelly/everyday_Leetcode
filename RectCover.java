public class Solution {
    public int RectCover(int target) {
        int i0=0;
        int i1=1;
        int temp=0;
        for(int x=1;x<=target;x++)
        {
            temp=i0+i1;
            i0=i1;
            i1=temp;
        }
        return temp;
    }
}