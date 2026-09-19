class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int firstOc=first(nums,target);
        if(firstOc==-1){
             return new int[]{-1,-1};}
        int lastO=last(nums,target);
        return new int[]{firstOc,lastO};

    }

    public int first(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                index = mid;
                high = mid - 1;
            } 
            else if (nums[mid] < target) {
                low=mid+1;
            } 
            else {
                high= mid - 1;
            }
        }
        return index;
    }

    public int last(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                index = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }
}