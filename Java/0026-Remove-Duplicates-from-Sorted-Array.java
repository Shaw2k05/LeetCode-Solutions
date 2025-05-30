class Solution {
    public int removeDuplicates(int[] nums) {
        
        int len = nums.length;
        int order = 1;

        for (int i = 1; i < len; i++) {

            if (nums[i] != nums[i - 1]) {
                
                nums[order] = nums[i];
                order++;
            }
        }

        return order;
    }
}