class Solution {
    public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
        int n=nums.length;
        int itr=0;int count=1;
    for(int i =1; i < n;i++)
    {
        if(nums[itr]!=nums[i]) {nums [++itr] = nums[i];count++;}
    }
        return count;
}
}
