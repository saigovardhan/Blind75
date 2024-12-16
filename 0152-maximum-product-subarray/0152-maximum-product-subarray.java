class Solution {
    public int maxProduct(int[] nums) {
        int prefix =1, postfix = 1;
        int res = Integer.MIN_VALUE;
        int len = nums.length;
        for(int i=0;i<nums.length;i++){
            prefix *= nums[i];
            postfix *=nums[len-i-1];
            
            res = Math.max(res, Math.max(prefix, postfix));

            if(prefix==0) prefix = 1;
            if(postfix==0) postfix = 1;

            
        }

        return res;
    }
}