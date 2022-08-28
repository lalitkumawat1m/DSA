class Solution {
    
   
public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer>mp=new HashMap<>();
        for( int i:nums){
            mp.put(i,mp.getOrDefault(i,1)+1);
        }
        List<Integer> list=new ArrayList<>(mp.keySet());
        Collections.sort(list,(a,b)->mp.get(b)-mp.get(a));
        int[] res=new int[k];
    int ind=0;
    while(ind<k){
        res[ind]=list.get(ind);
        ind++;
        
    }
      return res;  
    }
}