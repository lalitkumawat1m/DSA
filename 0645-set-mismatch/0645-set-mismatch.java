class Solution {
    public int[] findErrorNums(int[] nums) {
        int []ans=new int[]{-1,-1};
        int n=nums.length;
        int sum=nums[0];
        Set<Integer>set=new HashSet<>();
        set.add(nums[0]);
        for(int i=1;i<n;i++){
            if(set.contains(nums[i])){
                ans[0]=nums[i];
            }
            set.add(nums[i]);
            sum+=nums[i];
        }
        ans[1]=((n+1)*n/2)-sum+ans[0];
        return ans;
        
    }
}
