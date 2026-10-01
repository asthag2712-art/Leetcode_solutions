class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        /*  int index=-1;
        int ans=-1;
        for(int i=1;i<n-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                index=i;
                break;
            }
        
        }
        if(index==-1){
            return binary(nums,0,n-1,target);
        }
        if(target==nums[index]){
            ans=index;
        }
        else if(target>nums[n-1]){
            ans=binary(nums,0,index-1,target);
        }
        else if(target<=nums[0]){
            ans=binary(nums,index+1,n-1,target);
        }
        return ans;
        }
        */

        //Optimal

        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;

                }

                else {
                    low = mid + 1;

                }
            } else {
                if (target >nums[mid] && target <= nums[high]) {
                    low = mid + 1;

                }

                else {
                    high = mid - 1;

                }

            }
        }
        return -1;

    }

    public int binary(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}