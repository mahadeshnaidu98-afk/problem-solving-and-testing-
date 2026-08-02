class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Points to the position where the next valid element will be placed

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}