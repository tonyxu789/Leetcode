import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Solution1 {

    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    solution[0] = i;
                    solution[1] = j;
                }
            }
        }

        return solution;

    }

    public int[] twoSumHashTwice(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
//        int[] ints = new int[0];
//        return ints;
        return null;
    }

    public int[] twoSumHashOnce(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
            int complement = target - nums[i];
            if (map.containsValue(complement)){
                Set<Integer> keySet = map.keySet();
                Iterator<Integer> iterator = keySet.iterator();
                while (iterator.hasNext()){
                    int key = iterator.next();
                    int value = map.get(key);
                    if (value==complement && key!=i){
                        if (key>i){
                            return new int[]{i,key};
                        }else
                            return new int[]{key,i};
                    }
                }
            }
        }
        return null;
    }

}
