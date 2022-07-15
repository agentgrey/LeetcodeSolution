class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=0, size=0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j]==1) {
                    size = floodFill(grid,i,j);
                    if(size>max) {
                        max = size;
                    }
                }
            }
        }
        
        return max;
    }

    public int floodFill(int[][] grid, int i, int j) {
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]==0)
            return 0;
        grid[i][j]=0;
        int a,b,c,d;
        a=floodFill(grid, i+1,j);
        b=floodFill(grid, i-1,j);
        c=floodFill(grid, i,j+1);
        d=floodFill(grid, i,j-1);
        return 1+a+b+c+d;
    }
}