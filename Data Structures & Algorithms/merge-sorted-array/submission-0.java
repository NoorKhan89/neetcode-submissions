class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int[] res = new int[m+n];
       int i=0, j=0,k=0;

       while(i< m && j< n)
       {
        if(nums1[i] <= nums2[j])
        {
          res[k] = nums1[i];
          k=k+1;
          i=i+1;
        }
        else
        {
          res[k] = nums2[j];
          k=k+1; 
          j=j+1;
        }
       } 
       while(j< n)
       {
        res[k] = nums1[i];
        k=k+1;
        j=j+1;
       }

       while(i< m)
       {
        res[k] = nums1[i];
        k=k+1;
        i=i+1;
       }

       for(int p=0; p< res.length; p=p+1)
       {
        nums1[i] =res[p];
       }
    }
}












