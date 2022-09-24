// class NumArray {

//     int []segment;
//     int n;  
       
//     public NumArray(int[] nums) {
//         this.n=nums.length;
//         this.segment=new int[4*n];
//         makeSegmentTree(nums,1,0,n-1);
//     }
    
//     private void makeSegmentTree(int []nums,int index,int start,int end){
//         if(start==end){
//             this.segment[index]=nums[start];
//             return ;
//         }
        
//         int mid=start +(end-start)/2;
//         makeSegmentTree(nums,2*index,start,mid);
//         makeSegmentTree(nums,2*index+1,mid+1,end);
//         segment[index]=segment[2*index]+segment[2*index+1];                
        
//     }
    
//     public void update(int index, int val) {
//         updatehelper(1,0,n-1,index,val);
//     }
    
//     private void updatehelper(int index,int start,int end,int idx,int val){
//         if(idx>end|| idx<start){
//             return;
//         }
//         if(start==end){
//             segment[index]=val;
//             return;
//         }
        
        
//         int mid=start+(end-start)/2;
//         updatehelper(index,start,mid,idx,val);
//         updatehelper(index,mid+1,end,idx,val);
//         segment[index]=segment[2*index]+segment[2*index+1];
        
//     }                  
                        
                        
//     public int sumRange(int left, int right) {
//         return sumRangehelper(1,0,n-1,left,right);
//     }
                        
//      private int sumRangehelper(int index,int start,int end,int left,int right){
//          if(left<=start || right>=end){
//              return segment[index];
//          }
         
//          if(left>end || right<start){
//              return 0;
//          }
         
//          int mid=start+(end-start)/2;
         
//          int l=sumRangehelper(2*index,start,mid,left,right);
         
//          int r=sumRangehelper(2*index+1,mid+1,end,left,right);
//          return l+r;
//      }                   
                        
// }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */



class NumArray {

    int[] segment;
    int n;
    
    public NumArray(int[] nums) {
        this.n = nums.length;
        this.segment = new int[4 * n];
        makeSegmentTree(nums, 1, 0, n - 1);
    }
    
    private void makeSegmentTree(int[] nums, int pos, int start, int end){
        if(start == end){
            this.segment[pos] = nums[start];
            return;
        }
        
        int mid = start + (end - start) / 2;
        makeSegmentTree(nums, 2 * pos, start, mid);
        makeSegmentTree(nums, 2 * pos + 1, mid + 1, end);
        
        segment[pos] = segment[2 * pos] + segment[2 * pos + 1];
    }
    
    public void update(int index, int val) {
        updateHelper(1, 0, n - 1, index, val);
    }
    
    private void updateHelper(int pos, int start, int end, int idx, int val){
        if(start == end){
            segment[pos] = val;
            return;
        }
        
        int mid = start + (end - start) / 2;
        if(idx <= mid)
            updateHelper(2 * pos, start, mid, idx, val);
        else 
            updateHelper(2 * pos + 1, mid + 1, end, idx, val);
        segment[pos] = segment[2 * pos] + segment[2 * pos + 1]; 
    }
    
    public int sumRange(int left, int right) {
        return sumRangeHelper(1, 0, n - 1, left, right);
    }
    
    private int sumRangeHelper(int pos, int start, int end, int left, int right){
        if(left <= start && right >= end)
            return segment[pos];
        
        if(left > end || right < start)
            return 0;
        
        int mid = start + (end - start) / 2;
        int l = sumRangeHelper(2 * pos, start, mid, left, right);
        int r = sumRangeHelper(2 * pos + 1, mid + 1, end, left, right);
        return l + r;
    }
}
