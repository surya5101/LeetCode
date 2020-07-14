class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> s= new ArrayList();
        for(int i=0;i<nums.length;i++)
        {
            if(s.contains(nums[i])){s.remove(new Integer(nums[i]));}
            else if(!s.contains(nums[i])){s.add(nums[i]);}
        }
        return s.get(0);
    }
}
