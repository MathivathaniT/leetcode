class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int modcount[]=new int[k];
        modcount[0]=1;
        int prefixsum=0;
        int count=0;
        for(int num:nums){
            prefixsum+=num;
            int rem = prefixsum%k;
            if(rem<0){
                rem+=k;
            }
            count+=modcount[rem];
            modcount[rem]++;
        }
        return count;
        
    }
}