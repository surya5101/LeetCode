class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList <Integer>a = new ArrayList();
        //adding elements to arraylist from array
            for(int i=0;i<stones.length;i++)
            {
                a.add(stones[i]);
            }
        while(a.size()>1)
        {
            Collections.sort(a);
            Collections.reverse(a);
            int b=a.get(0);
            int c=a.get(1);
            int d=b-c;
            a.remove(0);
            a.remove(0);
            a.add(d);
        }
        int r=a.get(0);
        return r;
     
    }
}
