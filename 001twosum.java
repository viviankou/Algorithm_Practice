public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>(nums.length);
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(mp.containsKey(target-nums[i]))
            {
                res[0]=mp.get(target-nums[i])+1;
                res[1]=i+1;
                return res;
            }
            else
            {
                mp.put(nums[i],i);
            }
                
        }
        return res;
    }
}