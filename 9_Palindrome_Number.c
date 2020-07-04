

bool isPalindrome(int x){
    int num= x;
    int n=0;
    int itr=0;
    if(x<0)return 0;
    if(x/10==0)return 1;//if x=0 its still a palindrome but below loop will                             not execute
    while(num>0)
    {
        num=num/10;
        n++;
    }
    int arr[n];
    num=x;
     while(num>0)
    {
        arr[itr]=num%10;
         printf("\n%d",arr[itr]);
         num=num/10;
         itr++;
        
    }
     int flag=0,it1=0,it2=n-1;
    printf("\n%d",it2);
    while(it1<it2)
    { printf("\n%d  %d",arr[it1],arr[it2]);
        if(arr[it1]!=arr[it2]) {flag=1;break;}
        it1++;it2--;
    }
    if(flag==0)
    {
       return 1;
    }
    else{ return 0;}
    
}
