class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int[] res = new int[m + n];
        int i = 0, j = 0, k = 0;

        // BUG FIX: j must be compared against 'n' (size of nums2), not 'm'
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                res[k] = nums1[i];
                i++;
            } else {
                res[k] = nums2[j];
                j++;
            }
            k++;
        }

        // Add remaining elements from nums1
        while (i < m) {
            res[k++] = nums1[i++];
        }

        // Add remaining elements from nums2
        while (j < n) {
            res[k++] = nums2[j++];
        }

        // Copy the merged result back into nums1
        for (int p = 0; p < res.length; p++) {
            nums1[p] = res[p];
        }
    }
}












