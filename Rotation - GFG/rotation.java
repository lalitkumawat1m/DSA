//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int findKRotation(int arr[], int n) {
        // code here
        int left=0,right=n-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]>=arr[0]){
                left=mid+1;
            }
            else if(arr[mid]<arr[0]){
                right=mid;
            }
        }
        if(arr[left]<arr[0]){
            return left;
        }
        return 0;
    }
}