//{ Driver Code Starts
//Initial Template for Java
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumOfTwo(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String isSumOfTwo(int N){
        // code here
        boolean prime[]=new boolean [N+1];
        Arrays.fill(prime,true);
        
        prime[0]=prime[1]=false;
        
        for(int i=2;i<=N;i++){
            if(prime[i]){
                long st=(long)i*i;
                if(st>N){
                    continue;
                }
                for(int j=i*i;j<=N;j+=i){
                    prime[j]=false;
                }
            }
        }
        
        for(int i=2;i<=N;i++){
            if(prime[i]&& prime[N-i]){
                return "Yes";
            }
        }
        return "No";
        
    }
}