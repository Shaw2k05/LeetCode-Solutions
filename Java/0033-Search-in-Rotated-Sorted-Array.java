class Solution {
    public int search(int[] nums, int target) {
        
        int len = nums.length;

        int left = 0;
        int right = len - 1;

        while (left < right) {

            int mid = (left + right) / 2;

            if (nums[mid] < nums[right])
                right = mid;
            else
                left = mid + 1;
        }

        int rot = left;
        left = 0;
        right = len - 1;

        while (left <= right) {

            int mid = (left + right) / 2;
            int temp = (mid + rot) % len;
            //System.out.println(nums[temp]);

            if (nums[temp] == target)
                return temp;
            else if (nums[temp] > target)
                right = mid - 1;
            else
                left = mid + 1;
            //System.out.println(left + "\t" + right + "\n");
        }
        return -1;
    }
}