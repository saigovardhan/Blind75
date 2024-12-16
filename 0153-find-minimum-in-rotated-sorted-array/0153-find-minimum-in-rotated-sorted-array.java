class Solution {
    public int findMin(int[] nums) {
       int mini = Integer.MAX_VALUE;
       int start =0, end = nums.length-1;

       while(start <= end){
        int mid = (start+end)/2;
        
        if(nums[start] < nums[end]){
            mini = Math.min(mini, nums[start]);
            break;
        }

        if(nums[start]<=nums[mid]){
            mini = Math.min(mini, Math.min(nums[start], nums[mid]));
            start = mid+1;
        }else{
            mini = Math.min(mini, Math.min(nums[end], nums[mid]));
            end = mid-1;
        }
       }
       return mini;
    }
}