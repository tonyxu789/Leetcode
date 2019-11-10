import org.junit.Test;

public class Solution1Test {

    @Test
    public void twoSum() {
        Solution1 solution1 = new Solution1();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ints = solution1.twoSum(nums, target);
        for(int i=0; i<ints.length; i++){
            System.out.println(ints[i]);
        }
    }

    @Test
    public void twoSumHashTwice() {
        Solution1 solution1 = new Solution1();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] ints = solution1.twoSumHashTwice(nums, target);
        for(int i=0; i<ints.length; i++){
            System.out.println(ints[i]);
        }
    }

    @Test
    public void twoSumHashOnce() {
        Solution1 solution1 = new Solution1();
        int[] nums = {3,3};
        int target = 6;
        int[] ints = solution1.twoSumHashOnce(nums, target);
        for(int i=0; i<ints.length; i++){
            System.out.println(ints[i]);
        }
    }
}