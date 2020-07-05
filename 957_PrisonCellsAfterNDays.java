class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
     
    for(int i=0;i<(N-1)%14+1;i++)
    {    int[] arr=new int[8];
        for(int j=0;j<8;j++)
        {
            if(j==0||j==7) {arr[j]=0;continue;}
            if(cells[j-1]==cells[j+1])arr[j]=1;
            else arr[j]=0;
            
        }cells=arr;
    }return cells;  
    }
}
