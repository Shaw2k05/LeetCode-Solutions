class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();

        int len = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i < len - 2; i++) {

            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            if(nums[i] > 0) {
                break;
            }

            int j = i + 1;
            int k = len - 1;

            while(j < k) {

                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {

                    list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    while(j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    while(j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
                else if(sum < 0) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }

        return list;
    }
}