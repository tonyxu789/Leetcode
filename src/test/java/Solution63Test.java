import org.junit.Test;

import static org.junit.Assert.*;

public class Solution63Test {

    @Test
    public void uniquePathsWithObstacles() {

        Solution63 solution63 = new Solution63();
        int[][] input = {{0,0,0},{1,1,0},{0,1,0}};
        int output = solution63.uniquePathsWithObstacles(input);
        System.out.println(output);
    }
}