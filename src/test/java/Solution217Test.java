import org.junit.Test;

import static org.junit.Assert.*;

public class Solution217Test {

    @Test
    public void containsDuplicate() {

        Solution217 solution217 = new Solution217();
        int[] input = {1,2,3,4,5,6,6,7,8,9,4,2};
        boolean output = solution217.containsDuplicate(input);
        System.out.println(output);
    }
}