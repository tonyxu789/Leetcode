import org.junit.Test;

import static org.junit.Assert.*;

public class Solution38Test {

    @Test
    public void countAndSay() {
        Solution38 solution38 = new Solution38();
        int input = 7;
        String output = solution38.countAndSay(input);
        System.out.println(output);
    }
}