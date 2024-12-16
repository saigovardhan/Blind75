class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        int min = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = (start + end) / 2;

            // start < end -> already sorted starting is min
            if (nums[start] < nums[end]) {
                min = Math.min(min, nums[start]);
                break;
            }

            if (nums[start] <= nums[mid]) {
                // array is sorted on left side
                min = Math.min(min, Math.min(nums[start], nums[mid]));
                // search in right side
                start = mid + 1;
            } else {
                // array is sorted on right side
                min = Math.min(min, Math.min(nums[end], nums[mid]));
                end = mid - 1;
            }
        }
        return min;
    }
}