class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int res[]=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                res[0]=i;
                res[1]=map.get(complement);
                return res;

            }
            map.put(nums[i],i);
        }
       return res; 
    }
}