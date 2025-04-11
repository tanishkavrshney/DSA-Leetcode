class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int beg=1;
        int end=x;
        int ans=-1;
        while(beg<=end){
            int mid =  beg + (end - beg) / 2;
            if((long)mid*mid<=x){
                ans=mid;
                beg=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}