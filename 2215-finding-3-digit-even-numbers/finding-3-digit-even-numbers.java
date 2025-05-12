class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<digits.length;i++){
            if(digits[i]==0) continue;
            for(int j=0;j<digits.length;j++){
                if(j==i) continue;
                for(int k=0;k<digits.length;k++){
                    if(k==j || k==i) continue;
                    int num = digits[i]*100 + digits[j]*10 + digits[k];
                    if(num%2==0) set.add(num);
                }
            }
        }
        int[] result = new int[set.size()];
        int idx = 0;
        for (int num : set) {
            result[idx++] = num;
        }

        Arrays.sort(result);
        return result;
    }
}