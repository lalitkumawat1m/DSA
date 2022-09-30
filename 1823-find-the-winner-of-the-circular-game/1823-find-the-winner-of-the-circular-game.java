class Solution {
    public int solve(ArrayList<Integer>a,int k,int idx){
        if(a.size()==1){
            return a.get(0);
        }
        idx=((idx+k)%a.size());
        a.remove(idx);
        return solve(a,k,idx);
    }
    public int findTheWinner(int n, int k) {
         ArrayList<Integer>a=new ArrayList<>();
        int  ans=-1;
        k--;
        for(int i=1;i<=n;i++){
            a.add(i);
        }
        ans=solve(a,k,0);
        return ans;
    }
}


  