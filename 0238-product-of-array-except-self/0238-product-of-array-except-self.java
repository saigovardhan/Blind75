class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] preSum = new int[len+1];
        int[] postSum = new int[len+1];
        int[] res = new int[len];
        preSum[0] = 1;
        postSum[len] = 1;

        for(int i=1;i<=nums.length;i++){
            preSum[i] = preSum[i-1]*nums[i-1];
            postSum[len-i] = postSum[len-i+1]*nums[len-i];
        }
        for(int i=0;i<len;i++){
            res[i] = preSum[i]*postSum[i+1];
        }
        return res;
    }
}