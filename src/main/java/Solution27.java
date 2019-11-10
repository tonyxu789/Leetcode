import java.util.Stack;

public class Solution27 {
    public int removeElement(int[] nums, int val) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                stack.push(nums[i]);
            }
        }

        int count = 0;
        for(int j=stack.size()-1;j>=0;j--){
            nums[j] = stack.pop();
            count ++;
        }

        return count;
    }
}
