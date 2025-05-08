class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hash[]=new int[256];
        for (int i = 0; i < 256; i++) {
            hash[i] = -1;
        }
        int n=s.length();
        int l=0,r=0,maxlen=0,len;
        while(r<n){
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)]>=l){
                    l=hash[s.charAt(r)]+1;
                }
            }
            len=r-l+1;
            if(len>maxlen){maxlen=len;}
            hash[s.charAt(r)]=r;
            r++;
        }
        return maxlen;
    }
}