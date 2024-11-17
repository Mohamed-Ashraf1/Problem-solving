class Solution {
    public long minCost(int[] nums, int[] cost) {
        int left = Integer.MAX_VALUE, right = Integer.MIN_VALUE;
        for (int n : nums) {
            left = Math.min(left, n);
            right = Math.max(right, n);
        }
        long result = Long.MAX_VALUE;


        while (left <= right) {
            int mid =  (right + left) / 2;

            long costMid = totalCost(nums, cost, mid);
            long costLeft = totalCost(nums, cost, mid - 1);
            long costRight = totalCost(nums, cost, mid + 1);
            result = Math.min(result, costMid);

            if (costLeft < costMid) {
                right = mid - 1; 
            } else if (costRight < costMid) {
                left = mid + 1; 
            } else {
                break;
            }
        }

        return result;
    }

    private long totalCost(int[] nums, int[] cost, int target) {
        long result = 0L;
        for (int i = 0; i < nums.length; i++) {
            result += (long) Math.abs(nums[i] - target) * cost[i];
        }
        return result;
    }
}
