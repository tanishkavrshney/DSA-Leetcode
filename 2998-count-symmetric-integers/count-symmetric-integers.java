class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            if((lengthOf(i)%2==0) && symmetric(i)){
                c++;
            }
        }
        return c;
    }
    public int lengthOf(int num){
        int count = 0;

        do {
            count++;
            num /= 10;
        } while (num > 0);

        return count;
    }
    public boolean symmetric(int num){
        String s = String.valueOf(num);
        int mid = s.length() / 2;
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < mid; i++) {
            sum1 += s.charAt(i) - '0';
        }
        for (int i = mid; i < s.length(); i++) {
            sum2 += s.charAt(i) - '0';
        }

        return sum1 == sum2;
    }
}