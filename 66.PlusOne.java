class Solution {
   public int[] plusOne(int[] digits) {
        
    int n = digits.length;int i;
    for(i=n-1;i>=0;i--)
    {
        if(digits[i]<9) {digits[i]+=1;return digits;}
        else digits[i]=0;
    }
    if(i!=-1)
    return digits;
    else
    {
        int []arr=new int[n+1];
        arr[0]=1;return arr;
    }
}
}
