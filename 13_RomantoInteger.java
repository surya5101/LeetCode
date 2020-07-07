class Solution {
    public int find(char a)
    {
        if(a=='I') return 1;
       else if(a=='V') return 5;
       else if(a=='X') return 10;
        else if(a=='L') return 50;
       else if(a=='C') return 100;
       else if(a=='D') return 500;
       else if(a=='M') return 1000;
        return 0;
    }
    public int romanToInt(String s) {
        int res=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(find(s.charAt(i))<find(s.charAt(i+1))) res=res-find(s.charAt(i));
            else res=res+find(s.charAt(i));
                    
        }
        res=res+find(s.charAt(s.length()-1));
        return res;
    }
}
