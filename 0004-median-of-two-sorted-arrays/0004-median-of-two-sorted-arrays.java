class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] merge = new int[n+m];
        for(int i=0;i<n;i++)
        {
            merge[i] = nums1[i];
        }
        for(int i=0;i<m;i++)
        {
            merge[n+i] = nums2[i];
        }
        Arrays.sort(merge);

        int median;
        int i;

        if(merge.length % 2 != 0)
        {
            i = merge.length/2;
            return merge[i];
        }
        else
        {
            i = merge.length/2;
            double a = (merge[i-1] + merge[i]) / 2.0 ;
            return a;
        }
    }
}