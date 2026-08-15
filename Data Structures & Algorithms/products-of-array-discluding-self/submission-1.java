class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] product=new int[n];
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        for(int i=0;i<n;i++){
            product[i]=1;
        }
        int p=1;
        for(int i=0;i<n;i++){
            prefix[i]=p;
            p*=nums[i];
        }
        p=1;
        for(int i=n-1;i>=0;i--){
            suffix[i]=p;
            p*=nums[i];
        }
        for(int i=0;i<n;i++){
            product[i]=prefix[i]*suffix[i];
        }
        return product;
    }
}  
