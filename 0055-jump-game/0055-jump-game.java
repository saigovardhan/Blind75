class Solution {
    public boolean canJump(int[] nums) {
       //keep track of how many steps you can take forward
       //if current step is greater than, your reachable , give false
       //if current reachable is greater than total length , return true
       //update reachable 
        int reachable = 0;
       for(int i=0;i<nums.length;i++){

        if(i > reachable) return false;

        if(nums.length-1 <= reachable ) return true;

        reachable = Math.max(reachable, i+nums[i]);

       }
       return false;
    }

}