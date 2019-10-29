class Solution 
{
    public int largest1BorderedSquare(int[][] grid) 
    {
        int minnum=grid.length;
        for(int x=0;x<grid.length;x++)
        {
            minnum=(grid[x].length<minnum)? grid[x].length:minnum;
        }
        int maxtra=0;
        a:for(int i=minnum;i>0;i--) 
        {
            for(int x=0;x<=grid.length-i ;x++)
            {                                             
                w:for(int y=0;y<=grid[x].length-i;y++)
                {
                    int num=0;
                    for(int j=0;j<i;j++)
                    {
                        if(!(grid[x+j][y]==1 && grid[x][y+j]==1 && grid[x+i-1-j][y+i-1]==1 && grid[x+i-1][y+i-1-j]==1))
                        {
                           continue w;
                        }
                        num+=1;
                    }
                    if(num==i)
                    {
                        maxtra=i;
                        break a;
                    }  
                }
            }
        }
        return maxtra*maxtra;
    }
}