class Solution {
    public int maxSubArray(int[] nums) {
       int m = Integer.MIN_VALUE, temp = 0;
        for(int n : nums){
            temp+=n;
            m = Math.max(m, temp);
            if(temp<0){
                temp=0;
            }
        }
        return m;
    }
}