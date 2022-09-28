class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
         List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int n=nums.length;
        int subset_ct=(1<<n);
        
        for(int mask=0;mask<subset_ct;mask++){
            List<Integer>list=new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                if((mask & (1<<i))!=0){
                    list.add(nums[i]);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}