class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int res[] = {-1, -1};
        int mid;

        int left = 0; 
        int right = nums.length - 1;
        while (left <= right) {

            mid = (left + right) / 2;
            if (nums[mid] == target)
                res[0] = mid;

            if (nums[mid] >= target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        right = nums.length - 1;
        while (left <= right) {

            mid = (left + right) / 2;
            if(nums[mid] == target)
                res[1] = mid;

            if (nums[mid] <= target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return res;
    }
}