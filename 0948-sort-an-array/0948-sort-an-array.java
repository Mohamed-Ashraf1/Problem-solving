class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums;
    }

    void sort(int arr[], int left, int right)
    {
        if (left < right) {

            int mid = left + (right - left) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    void merge(int arr[], int left, int mid, int right)
    {
        // Find sizes of two subarrays to be merged
        int size1 = mid - left + 1;
        int size2 = right - mid;

        // Create temp arrays
        int leftArr[] = new int[size1];
        int rightArr[] = new int[size2];

        // Copy data to temp arrays
        for (int i = 0; i < size1; ++i)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < size2; ++j)
            rightArr[j] = arr[mid + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;
        while (i < size1 && j < size2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            }
            else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < size1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < size2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}