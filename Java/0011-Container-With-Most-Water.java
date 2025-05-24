class Solution {
    public int maxArea(int[] height) {
        
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        
        while (left < right) {

            int minHeight = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, minHeight * (right - left));
            
            while (left < right && height[left] <= minHeight)
                left++;
            while (left < right && height[right] <= minHeight)
                right--;
        }

        return maxArea;
    }
}