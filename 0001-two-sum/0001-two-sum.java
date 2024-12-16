class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int[] res = new int[2];
        Map<Integer,Integer> seen = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int req =target- nums[i];
            if(seen.containsKey(req)){
                res[0] = seen.get(req);
                res[1] = i;
                return res;
            }else{
                seen.put(nums[i], i);
            }
        }
        return res;
    }
}