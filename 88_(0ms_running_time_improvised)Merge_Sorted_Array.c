void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){

    //Iterating from back so that empties are filled and there is no clash
        int itr1=m-1,itr2=n-1,len=m+n-1;
       while(itr1>=0&&itr2>=0)
        {
            if(nums1[itr1]>nums2[itr2])
            {
                nums1[len--]=nums1[itr1--];
            }
           else
           {
                nums1[len--]=nums2[itr2--];            
           }
        }
            while (itr1>=0)
	        nums1[len--] = nums1[itr1--];
           while (itr2>=0)
	        nums1[len--] = nums2[itr2--];
}
