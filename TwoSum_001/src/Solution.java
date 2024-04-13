public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i)
            for (int j = i + 1; j < nums.length; ++j)
                if (nums[i] + nums[j] == target) {
                    System.out.println("Indices are: " + i + ", " + j);
                    return new int[]{i, j};
                }
        throw new IllegalArgumentException("No to sum solution");
    }
}
