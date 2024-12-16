class Solution {
    public int maxArea(int[] height) {
       //two pointers
       //find min on left or right
       //multiply min with dist = max_water
       //move min val +1

       int start = 0, end = height.length-1, maxWater = Integer.MIN_VALUE;
       while(start < end){
        int dist = (end-start);
        int tempWater = Math.min(height[start], height[end]) * dist;
        maxWater = Math.max(maxWater, tempWater);
        if(height[start] < height[end]){
            start++;
        }else{
            end--;
        }
       }
       return maxWater;
    }
}