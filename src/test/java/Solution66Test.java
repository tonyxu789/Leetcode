import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Solution66Test {

    @Test
    public void plusOne() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        int i = nums.get(3);
        System.out.println(i);

        Solution66 solution66 = new Solution66();
        int[] input = {2,3,4,5,6,7,8,9,9,9,9,9};
        int[] output = solution66.plusOne(input);
        for(int num:output)
            System.out.println(num);
    }
}