class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] outp=new int[2];
        for(int i=0;i<nums.length-1;i++){
            int diff=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==diff)
                {
                    outp[0]=i;
                    outp[1]=j;
                }
            }
        }
        return outp;
    }
}