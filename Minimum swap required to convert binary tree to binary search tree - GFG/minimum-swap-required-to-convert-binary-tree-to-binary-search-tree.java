//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.minSwaps(n, A);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int minSwaps(int n, int[] A) {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        inorder(A,al,0);
        int minSwap=0;
        for(int i=0;i<A.length;i++){
            if(A[i]!=al.get(i)){
                int j=i+1;
                while(j<A.length){
                    if(al.get(j)==A[i]){
                        swap(al,i,j);
                        minSwap++;
                    }
                    j++;
                }
            }
           
        }
         return minSwap;
    }
    public static void swap(ArrayList<Integer>al,int i,int j){
        int temp=al.get(i);
        al.set(i,al.get(j));
        al.set(j,temp);
    }
    public static void inorder(int[]A,ArrayList<Integer>al,int i){
        if(i>=A.length){
            return;
        }
        inorder(A,al,2*i+1);
        al.add(A[i]);
        inorder(A,al,2*i+2);
    }
}
        
