import org.junit.Test;

import static org.junit.Assert.*;

public class Solution242Test {

    @Test
    public void isAnagram() {

        Solution242 solution242 = new Solution242();
        String s1 = "add";
        String s2 = "hcc";
        boolean output = solution242.isAnagram(s1,s2);
        System.out.println(output);

    }
}