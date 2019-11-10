import org.junit.Test;

import static org.junit.Assert.*;

public class Solution27Test {

    @Test
    public void removeElement() {
        Solution27 solution27 = new Solution27();
        int[] input = {1,1,2,2,2,3,3,3,3,4};
        int target = 3;
        int result = solution27.removeElement(input, target);
        System.out.println(result);
    }
}