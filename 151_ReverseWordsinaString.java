class Solution {
    public String reverseWords(String s) {
        s= s.trim();
        String[] st= s.split(" ");
        StringBuilder str=new StringBuilder();
        for(int i=st.length-1;i>=0;i--)
                {if(i==0){
                    str.append(st[i]);
                    break;
                }
             if(!st[i].equals(""))           
            str.append(st[i]+" ");
        }
        return s=str.toString();
    }
}
