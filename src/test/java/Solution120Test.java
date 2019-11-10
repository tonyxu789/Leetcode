import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Solution120Test {

    @Test
    public void minimumTotal() {
        Solution120 solution120 = new Solution120();
        List<List<Integer>> input = new ArrayList<>();
        List<Integer> integers1 = new ArrayList<>();
        List<Integer> integers2 = new ArrayList<>();
        List<Integer> integers3 = new ArrayList<>();
        List<Integer> integers4 = new ArrayList<>();
        input.add(integers1);
        input.add(integers2);
        input.add(integers3);
        input.add(integers4);
        input.get(0).add(1);
        input.get(1).add(2);
        input.get(1).add(3);
        input.get(2).add(4);
        input.get(2).add(5);
        input.get(2).add(6);
        input.get(3).add(7);
        input.get(3).add(8);
        input.get(3).add(9);
        input.get(3).add(10);

        System.out.println(input);



        int output = solution120.minimumTotal(input);
        System.out.println(output);
    }
}