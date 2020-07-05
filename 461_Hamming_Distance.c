int hammingDistance(int x, int y) {
    
    int tnt=x^y;int c=0;
    while(tnt>0)
    {
        if(tnt&1)
        { c++;}
        tnt>>=1;
    }
            return c;
}
