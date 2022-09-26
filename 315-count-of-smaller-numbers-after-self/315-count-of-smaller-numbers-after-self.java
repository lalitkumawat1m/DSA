class Node {
    int start;
    int end;
    int count;
    Node left;
    Node right;
    public Node(int start, int end, int count) {
        this.start = start;
        this.end = end;
        this.count = count;
    }
}

class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> result = new ArrayList();
        if (nums.length == 0) {
            return result;
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        
        Node root = buildIntervalTree(min, max, 0);
        System.out.println(root.start + " " + root.end + " " + root.count);
        for (int i = nums.length - 1; i >= 0 ;i--) {
            updateIntervalTree(root, nums[i], 1);
            result.add(countRange(root, nums[i] - 1));    
        }
        
        Collections.reverse(result);
        return result;
    }
    
    private Node buildIntervalTree(int start, int end, int value) {
        if (start > end) {
            return null;
        }
        
        Node node = new Node(start, end, 0);
        if (start == end) {
            return node;
        }
        
        int mid = start + (end - start)/2;
        node.left = buildIntervalTree(start, mid, 0);
        node.right = buildIntervalTree(mid + 1, end, 0);
        return node;
    }
    
    private void updateIntervalTree(Node node, int num, int value) {
        if (node == null) {
            return; 
        }
        
        if (num < node.start || num > node.end) {
            return;
        }
    
        node.count += value;
        updateIntervalTree(node.left, num, value);
        updateIntervalTree(node.right, num, value);
    }
    
    private int countRange(Node node, int num) {
        if (node == null) {
            return 0;
        }
        
        // completely in range
        if (num >= node.start && node.end <= num) {
            return node.count;
        } 
        
        // outside range
        if (num < node.start) {
            return 0;
        }
        
        return countRange(node.left, num) + countRange(node.right, num);
    }
}