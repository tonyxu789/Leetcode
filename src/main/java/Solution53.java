public class Solution53 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = nums[0];

        for(int num:nums){
            if(sum>0){
                sum = sum+num;
            }else{
                sum = num;
            }
            ans = Math.max(ans,sum);
        }

        return ans;
    }
}
