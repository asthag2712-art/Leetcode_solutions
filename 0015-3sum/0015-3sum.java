class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        /*Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                for(int k=j+1;k<n;k++){
                    if(k>j+1 && nums[k]==nums[k-1]) continue;
                    List<Integer> row=new ArrayList<>();
                    if(nums[i]+nums[j]+nums[k]==0 ){
                        row.add(nums[i]);
                        row.add(nums[j]);
                        row.add(nums[k]);
                        ans.add(row);
        
                    }
                    
                }
            }
        }
        return ans;
        
        
        
        for(int i=0;i<n;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i+1;j<n;j++){
                
                int k=-(nums[i]+nums[j]);
                List<Integer> row=new ArrayList<>();
                if(set.contains(k)){
                   
                    row.add(nums[i]);
                    row.add(nums[j]);
                    row.add(k);
                    Collections.sort(row);
                     ans.add(row);
                }
               
               
                 set.add(nums[j]);
            }
        }
        return  new ArrayList<>(ans); 
        
        */
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                List<Integer> row = new ArrayList<>();
                if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;

                } else if (nums[i] + nums[j] + nums[k] < 0) {

                    j++;

                } else {
                    row.add(nums[i]);
                    row.add(nums[j]);
                    row.add(nums[k]);
                    ans.add(row);
                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1])
                        j++;
                    while (j < k && nums[k] == nums[k + 1])
                        k--;

                }

            }
        }
        return ans;
    }
}
