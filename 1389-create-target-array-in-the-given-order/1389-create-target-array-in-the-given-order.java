class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        int n = nums.length;
        
        int[] result = new int[nums.length];

        for(int i=0; i<n; i++)
        {
            for(int j=i;j>index[i];j--)
            {
                result[j] = result[j-1];
            }
            result[index[i]] = nums[i];
        }
        return result;   
    }
}