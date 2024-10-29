class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++)
        {
            max=Math.max(piles[i],max);
        }
        int low=1;
        int high=max;
        int a=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int ans=ispos(piles,mid);
            
            if(ans<=h)
            { 
                a=mid;  
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return a;
        
    }
    public int ispos(int[] arr,int k)
    {
        int d=0;
        for(int i=0;i<arr.length;i++)
        {
            d+=Math.ceil((double)arr[i]/k);
            
        }
        return d;
    }
}