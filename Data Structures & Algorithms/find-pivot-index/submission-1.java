class Solution {
    public int pivotIndex(int[] nums) {
        /*
        loop through all numbers
        add the sum of the current numbers
        skip one index, then add the sum of the next numbers
        if == return
        */

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = 0;
            for (int c = i + 1; c < nums.length; c++) {
                rightSum+=nums[c];
            }
            if (rightSum == sum) return i;
            sum+=nums[i];

        }
        return -1;
    }
}