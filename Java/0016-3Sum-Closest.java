class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int closest = Integer.MAX_VALUE;
        
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                
                int currSum = nums[i] + nums[left] + nums[right];

                if (Math.abs(closest - target) > Math.abs(currSum - target))
                    closest = currSum;

                if (currSum < target)
                    left++;
                else if (currSum > target)
                    right--;
                else
                    return target;
            }
        }

        return closest;
    }
}