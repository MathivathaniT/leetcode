class Solution {
    public int[] constructArray(int n, int k) {
        int ans[]=new int[n];
        int index=0;
        int left=1;
        int right=k+1;
        while(left<=right){
            if(left==right){
                ans[index++]=left;
                break;
            }
            ans[index++]=left++;
            ans[index++]=right--;
        }
        for(int i=k+2;i<=n;i++){
            ans[index++]=i;
        }
        return ans;
        
    }
}