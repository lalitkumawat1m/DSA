//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            
            Solution ob = new Solution();
            System.out.println(ob.minFind(n, a));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int minFind(int n, String a[]){
        // code here
        int redcnt=0,greencnt=0,bluecnt=0;
        
        for(int i=0;i<n;i++){
            if(a[i].equals("R")){
                redcnt++;
            }
            else if(a[i].equals("G")){
                greencnt++;
            }
            else{
                bluecnt++;
            }
        }
        if(redcnt==n||greencnt==n||bluecnt==n){
            return n;
        }
        if((redcnt%2==0&&greencnt%2==0&&bluecnt%2==0)||(redcnt%2==1&&greencnt%2==1&&bluecnt%2==1)){
            return 2;
        }
        
        return 1;
        
    }
}