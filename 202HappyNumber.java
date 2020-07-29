class Solution {
    HashSet s = new HashSet();
    public boolean isHappy(int n) {
        int t= n;
        while(t>1)
        { int sum=0;
            while(t!=0)
            {
                sum+=(t%10)*(t%10);
                t=t/10;
            }
         t=sum;
         if(!s.contains(t)){s.add(t);}
         else return false;
        }if(t==1)return true;
        else return false;
    }
}
