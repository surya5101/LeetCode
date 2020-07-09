class Solution {
    public int lengthOfLongestSubstring(String s) {
      char [] arr=s.toCharArray();
        int n=arr.length;int max=0;
        for(int i=0;i<n;i++)
        {   int c=0,count=0;int flag=1;
            if(max>=n-i)break;
            for(int j=i;j<n;j++)
            {
                int val=Character.getNumericValue( arr[j])-Character.getNumericValue('a');
                if(val<0){if(flag==1){flag=0;count++;continue;}else{break;}}
                if((c&(1<<val))>0)
                {
                    break;
                }
                c|=1<<val;count++;
            }
         if(count>max)max=count;
        }return max;
    }
}
