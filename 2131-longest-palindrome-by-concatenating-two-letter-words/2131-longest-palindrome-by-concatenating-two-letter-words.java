class Solution {
    public int longestPalindrome(String[] words) {
        Map<String,Integer>map=new HashMap<>();
        for(String w:words){
            if(map.containsKey(w)){
                map.put(w,map.getOrDefault(w,0)+1);
            }
            else{
                map.put(w,1);
            }
        }
        int len=0;
        boolean hasCenter=false;
        for(String w:words){
            String reversed=reverse(w);
            if(!map.containsKey(w) || map.get(w)==0){
                continue;
            }
            if(!map.containsKey(reversed)||          map.get(reversed)==0){
              continue;
            }
            if(w.equals(reversed)){
                if(map.get(w)%2==0){
                    len+=map.get(w)*2;
                    map.remove(w);
                }
                else{
                    len+=(map.get(w)-1)*2;
                    map.put(w,1);
                    hasCenter=true;
                }
            }
            else{
                int min=Math.min(map.get(reversed),map.get(w));
                len+=min*4;
                map.put(w,map.get(w)-min);
                map.put(reversed,map.get(reversed)-min);
            }
        }
        return len+((!hasCenter)?0:2);
        
    }
     
    private String reverse(String w) {
        StringBuilder sb = new StringBuilder(w);
        String reversed = sb.reverse().toString();
        return reversed;
    }
}
      