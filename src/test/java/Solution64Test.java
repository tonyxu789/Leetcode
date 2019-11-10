import org.junit.Test;

import static org.junit.Assert.*;

public class Solution64Test {

    @Test
    public void minPathSum() {

        Solution64 solution64 = new Solution64();
        int[][] input = {{0,0,0},{1,1,0},{0,1,0}};
        int output = solution64.minPathSum(input);
        System.out.println(output);

    }
}