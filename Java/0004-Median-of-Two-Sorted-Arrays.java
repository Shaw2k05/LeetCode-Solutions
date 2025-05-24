class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1 + len2;
        
        int nums[] = new int[len];
        
        int i = 0, j = 0, k = 0;
        while(k <= len / 2 && i < len1 && j < len2) {

            if(nums1[i] < nums2[j]) {

                nums[k++] = nums1[i++];
            }

            else {

                nums[k++] = nums2[j++];
            }
        }

        while(k <= len / 2 && i < len1) {

            nums[k++] = nums1[i++];
        }
        
        while(k <= len / 2 && j < len2) {

            nums[k++] = nums2[j++];
        }

        if(len % 2 == 1) {

            return nums[(int)(len / 2)];
        }

        return (0.0 + (nums[len / 2] + nums[(len / 2) - 1])) / 2;
    }
}