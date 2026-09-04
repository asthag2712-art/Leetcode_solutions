class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int k =j+1;
                int l = n - 1;
                while ( k < l) {
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];

                    if (sum > target) {
                
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        List<Integer> row = new ArrayList<>();
                        row.add(nums[i]);
                        row.add(nums[j]);
                        row.add(nums[k]);
                        row.add(nums[l]);
                        ans.add(row);
                    
                        k++;
                        l--;

                        while (k < l && nums[l] == nums[l + 1])
                            l--;
                        while (k < l && nums[k] == nums[k - 1])
                            k++;
                       

                    }
                }

            }

        }
        return ans;

    }
}