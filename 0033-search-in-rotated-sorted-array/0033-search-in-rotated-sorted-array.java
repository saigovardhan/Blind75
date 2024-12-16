class Solution {
    public int search(int[] nums, int target) {
       //find which side is sorted
        //check which side target belongs
        //binary search for target

        int start = 0, end = nums.length-1;

        while(start<=end) {
            int mid = (start+end)/2;
            if(nums[start]==target)return start;
            if(nums[end] == target) return end;
            if(nums[mid]==target) return mid;

            if(nums[start] <= nums[mid]){
                //left side is sorted
                if(target > nums[start]&& target< nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                //right side is sorted
               if(target > nums[mid] && target < nums[end]) {
                start = mid+1;
               }else{
                end = mid-1;
               }
            }
        }
        return -1;
    }
}