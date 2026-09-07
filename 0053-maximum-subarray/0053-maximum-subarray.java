class Solution {
    public int maxSubArray(int[] nums) {

         int n=nums.length;
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        int start=0;
        int ansStart=0,ansEnd=0;
        for(int i=0;i<n;i++){
            if(sum==0) start=i;
            sum+=nums[i];
            if(sum>maxi){
                maxi=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0){
                sum=0;
            }

        }
        return maxi;
        
        
    }
}