import org.junit.Test;

import static org.junit.Assert.*;

public class Solution14Test {

    @Test
    public void longestCommonPrefix() {
        Solution14 solution14 = new Solution14();
        String[] input = {"caa","","a","acb"};
        String result = solution14.longestCommonPrefix(input);
        System.out.println(result);
    }
}