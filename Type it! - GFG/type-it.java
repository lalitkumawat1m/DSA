//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String s = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.minOperation(s);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minOperation(String s) {
        // code here
        int size=s.length();
        int halfSize=size/2;
        int reduce=0;
        while(halfSize>=1){
            int i=0;
            int j=halfSize;
            String string1=s.substring(i,j);
            String string2=s.substring(j,j+j);
            if(string1.equals(string2)){
                reduce=halfSize-1;
                break;
            }
            halfSize-=1;
        }
        return size-reduce;
    }
}