import java.util.Stack;

public class Solution26 {
    public int removeDuplicates(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i < nums.length; i++){
            if(stack.empty()){
                stack.push(nums[i]);
            }else if(!(nums[i] == stack.peek())){
                stack.push(nums[i]);
            }else{
                continue;
            }
        }

        int size = stack.size();
        int j = size-1;
        while(!stack.empty()){
            nums[j] = stack.pop();
            j --;
        }

        return size;
    }
}
