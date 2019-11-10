import org.junit.Test;

import static org.junit.Assert.*;

public class Solution219Test {

    @Test
    public void containsNearbyDuplicate() {
        Solution219 solution219 = new Solution219();
        int[] input = {1,2,3,1};
        int n = 6;
        boolean output = solution219.containsNearbyDuplicate(input,n);
        System.out.println(output);
    }
}