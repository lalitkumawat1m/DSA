class Solution {
      int x;
   int y;
   int  dp[][];
   
   int dfs(int i,int j){
       if(i==x-1||j==y-1){
           return 1;
       }
       if(dp[i][j]!=0){
           return dp[i][j];
       }
       int  right=dfs(i,j+1);
       int left=dfs(i+1,j);
       return dp[i][j]=(right+left);
   }
   
   
    public int uniquePaths(int m, int n) {
          x=m;
        y=n;
        dp=new int[101][101];
        return dfs(0,0);
    }
}