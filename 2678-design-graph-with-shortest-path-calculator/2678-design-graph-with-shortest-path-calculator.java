class Graph {
   private List<List<int[]>> adjList;
    public Graph(int n, int[][] edges) {
        adjList=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int []edge:edges){
            addEdge(edge);
        }
    }
    
    public void addEdge(int[] edge) {
        int [] edgeArray={edge[1], edge[2]};
        adjList.get(edge[0]).add(edgeArray);
    }
    
    public int shortestPath(int node1, int node2) {
        return dijkstra(node1,node2);
    }

    public int dijkstra(int start,int end){
        int n=adjList.size();
        int [] distance=new int[n];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[start]=0;


        PriorityQueue<int[]>pq=new PriorityQueue<>(Comparator.comparingInt(o->o[0]));
        pq.add(new int[]{0,start});

        while(!pq.isEmpty()){
            int []curr=pq.poll();
            int currNode=curr[1];
            int currCost=curr[0];

            if(currCost>distance[currNode]){
                continue;
            }

            if(currNode==end){
                return currCost;
            }

            for(int []edge:adjList.get(currNode)){
                int neighbor=edge[0],edgeLength=edge[1];
                int newRouteCost=edgeLength+distance[currNode];

                if(distance[neighbor]>newRouteCost){
                    distance[neighbor]=newRouteCost;
                    pq.add(new int[]{newRouteCost,neighbor});
                }
            }
        }
        return ((distance[end]==Integer.MAX_VALUE)?-1:distance[end]);
    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */