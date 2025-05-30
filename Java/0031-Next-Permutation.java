class Solution {
    public void nextPermutation(int[] nums) {

        int len = nums.length;
        int pos = len - 1;
        while (pos > 0 && nums[pos - 1] >= nums[pos]) {
            pos--;
        }

        if (pos == 0) {
            Arrays.sort(nums);
            return;
        }
        
        int minLeft = pos;
        for (int i = pos + 1; i < len; i++) {
            if (nums[i] > nums[pos - 1] && nums[i] < nums[minLeft])
                minLeft = i;
        }
        int temp = nums[minLeft];
        nums[minLeft] = nums[pos - 1];
        nums[pos - 1] = temp;

        Arrays.sort(nums, pos, len);
    }
}