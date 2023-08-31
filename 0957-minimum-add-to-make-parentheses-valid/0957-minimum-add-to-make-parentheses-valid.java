class Solution {
    public int minAddToMakeValid(String s) {
        int opening =0;
        int closing=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                closing++;
            }
            else{
                if(closing==0){
                    opening++;
                }
                else{
                    closing--;
                }
            }
        }
        return opening+closing;
    }
}