import org.junit.Test;

import static org.junit.Assert.*;

public class Solution13Test {

    @Test
    public void romanToInt() {
        Solution13 solution13 = new Solution13();
        String input = "DCXXI";
        int result = solution13.romanToInt(input);
        System.out.println(result);
    }
}