//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.splitArray(arr,N,K));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int splitArray(int[] arr , int N, int K) {
        // code here
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
        }
        
        int ans=0,l=max,h=sum,mid;
        while(l<=h){
            mid=(l+h)/2;
            int ctr=1,s=0;
            for(int i=0;i<N;i++){
                s+=arr[i];
                if(s>mid){
                    ctr++;
                    s=arr[i];
                }
            }
            if(ctr>K){
                l=mid+1;
            }else{
                ans=mid;
                h=mid-1;
            }
        }
        return ans;
        
        
    }
};