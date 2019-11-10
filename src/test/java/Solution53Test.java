import org.junit.Test;

public class Solution53Test {

    @Test
    public void maxSubArray() {
        Solution53 solution53 = new Solution53();
        int[] input = {1,2,3,4,-1,5,-20,3,4,-2,100};
        int output = solution53.maxSubArray(input);
        System.out.println(output);
    }
}