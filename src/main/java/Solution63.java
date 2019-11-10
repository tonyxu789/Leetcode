public class Solution63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        if(obstacleGrid[0][0] == 1){
            return 0;
        }

        dp[0][0] = 1;
        for (int i = 1; i < n; i++) {
            if(n>1){
                dp[i][0] = (obstacleGrid[i][0] == 0 && dp[i - 1][0] == 1) ? 1 : 0;
            }

            else return 1;
        }

        for (int i = 1; i < m; i++) {
            if(m>1){
                dp[0][i] = (obstacleGrid[0][i] == 0 && dp[0][i - 1] == 1) ? 1 : 0;
            }

            else return 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                } else {
                    obstacleGrid[i][j] = 0;
                }
            }
        }

        return dp[n-1][m-1];


    }

}
