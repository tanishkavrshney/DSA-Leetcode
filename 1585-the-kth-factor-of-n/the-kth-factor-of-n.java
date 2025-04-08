class Solution {
    public int kthFactor(int n, int k) {
        int cnt=1;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                if(cnt==k){
                    return i;
                }
                cnt++;
            }
        }
        return -1;
    }
}