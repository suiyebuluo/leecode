public class min_lujinghe {
    //暴力法
//    public int calculate(int[][] grid,int i,int j){
//        if (i==grid.length||j==grid[0].length)
//            return Integer.MAX_VALUE;
//        if(i==grid.length-1&&j==grid[0].length-1)
//            return grid[i][j];
//        return grid[i][j]+Math.min(calculate(grid,i+1,j),calculate(grid, i, j+1));
//    }
//    public int minPathSum(int[][] grid){
//        return calculate(grid,0,0);
//    }
    //二维动态规划
    public int minPathSum(int[][] grid){
        int[][] dp=new int[grid.length][grid[0].length];
        for (int i = grid.length-1; i >=0; i--) {
            for (int j = grid[0].length-1; j >=0; j--) {
                if (i==grid.length-1&&j!=grid[0].length-1)
                    dp[i][j]=grid[i][j]+dp[i][j+1];
                else if (i!=grid.length-1&&j==grid[0].length-1)
                    dp[i][j]=grid[i][j]+dp[i+1][j];
                else if (i!=grid.length-1&&j!=grid[0].length-1)
                    dp[i][j]=grid[i][j]+Math.min(dp[i+1][j],dp[i][j+1]);
                else
                    dp[i][j]=grid[i][j];
            }
        }
        return dp[0][0];
    }

}
