class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[][] pairs = new int[n][2]; // [0] = value, [1] = original index

        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);

        int i = 0, j = n - 1;
        while (i < j) {
            int sum = pairs[i][0] + pairs[j][0];

            if (sum == target) {
                int idx1 = pairs[i][1];
                int idx2 = pairs[j][1];
                // chhota index pehle
                if (idx1 < idx2)
                    return new int[] { idx1, idx2 };
                else
                    return new int[] { idx2, idx1 };
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[] {};
    }
}