import org.junit.Test;

import static org.junit.Assert.*;

public class Solution26Test {

    @Test
    public void removeDuplicates() {
        Solution26 solution26 = new Solution26();
        int[] input = {1,1,2,2,2,3,3,3,3,4};
        int result = solution26.removeDuplicates(input);
        System.out.println(result);
    }
}