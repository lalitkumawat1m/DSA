class Solution {
    public int maxLength(List<String> arr) {
        var max=new int[]{0};
        maxLength(arr,0,"",max);
        return max[0];
    }
    private void maxLength(List<String>arr,int start,String current,int max[]){
        if(start==arr.size()){
            max[0]=Math.max(max[0],check(current));
        }
        else{
            maxLength(arr,start+1,current,max);
            maxLength(arr,start+1,current+arr.get(start),max);
        }
    }
    private int check(String current){
        var set=new HashSet<>(26);
        for(var i=0;i<current.length();i++){
            if(set.contains(current.charAt(i))){
                return -1;
            }
            set.add(current.charAt(i));
        }
        return current.length();
    }
}
