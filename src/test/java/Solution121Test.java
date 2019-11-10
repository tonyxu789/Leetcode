import org.junit.Test;

import static org.junit.Assert.*;

public class Solution121Test {

    @Test
    public void maxProfit() {

        Solution121 solution121 = new Solution121();
        int[] input = {1,2,3,4,5,6,7,8};
        int output = solution121.maxProfit(input);
        System.out.println(output);
    }
}