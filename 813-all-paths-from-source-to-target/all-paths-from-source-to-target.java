class Solution {
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> map = new ArrayList<>();
        dfs(map, graph, 0, new ArrayList<>());
        return map;
    }
    public void dfs(List<List<Integer>> map, int [][] graph, int node, List<Integer> list){
        list.add(node);
        if ( node == graph.length-1) {
            map.add(new ArrayList<>(list));
            }
        for(int i =0 ; i<graph[node].length; i++){
            dfs(map,graph, graph[node][i], list);
        }
        list.remove(list.size()-1);
    }
}