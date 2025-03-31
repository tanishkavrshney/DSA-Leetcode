class Solution {
    public int countGoodNumbers(long n) {
        final int mod = 1000000007;
        long even = n/2+n%2;
        long odd = n/2;
        long result = (pow(5,even)*pow(4,odd))%mod;
        return (int)result;
    }
    public long pow(long x,long y){
        final int mod = 1000000007;
        if(y==0) return 1;
        long ans = pow(x,y/2);
        ans*=ans; //ans= (x,y/2)*(x,y/2)
        ans%=mod;
        if(y%2==1) ans*=x;
        ans%=mod;
        return ans;
    }
}