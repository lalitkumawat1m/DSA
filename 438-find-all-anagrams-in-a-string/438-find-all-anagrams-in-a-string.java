class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> al=new ArrayList<>();
        
       int k= p.length();
       int ans=0;
       HashMap<Character, Integer> map = new HashMap<>();
       for(int i=0;i<p.length();i++)
       {
           char ch = p.charAt(i);
           if(map.containsKey(ch))
           {
               map.put(ch, map.get(ch)+1);
           }
           else{
               map.put(ch, 1);
           }
       }
       int i=0;
       int j=0;
       int count = map.size();
       while(j < s.length())
       {
           char ch = s.charAt(j);
           if(map.containsKey(ch))
           {
               map.put(ch,map.get(ch)-1);
               if(map.get(ch)==0)
               {
                   count--;
               }
           }
           if(j-i+1 <k)
           {
               j++;
           }
           else if(j-i +1 == k)
           {
               if(count ==0)
               {
                   ans++;
                   al.add(i);
               }
               char ch1= s.charAt(i);
               if(map.containsKey(ch1))
               {
                   map.put(ch1, map.get(ch1)+1);
                   if(map.get(ch1) == 1)
                   {
                       count++;
                   }
               }
               i++;
               j++;
           }
       }
       return al;
        
        
    }
}