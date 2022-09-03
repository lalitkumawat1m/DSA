
class Solution {
 public List<String> findRepeatedDnaSequences(String s) {
        
     List<String> res=new ArrayList<String>();
     if(s==null||s.length()<=10){
         return res;
     }
     
     Set<String>s1=new HashSet<String>();
     Set<String>s2=new HashSet<String>();
     
     for(int i=0;i<=s.length()-10;i++){
         String t=s.substring(i,i+10);
         
         if(!s1.add(t)){
             s2.add(t);
         }
     }
     res.addAll(s2);
     return res;
     
     
    }
}