class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        // 인접 리스트를 생성한다. 
        List<List<Integer>> graph = new ArrayList<>();
        // 인접 리스트를 초기화한다. 
        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];

            // 양방향 그래프를 만족하도록 a와 b가 서로 연결되게 한다.
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        boolean[] visited = new boolean[n];

        return dfs(graph, visited, source, destination);
    }

    private boolean dfs(List<List<Integer>> graph, boolean[] visited, int node, int target) {
        if(node == target) return true;
        if(visited[node]) return false;

        visited[node] = true;

        for (int next : graph.get(node)) {
            if (dfs(graph, visited, next, target)) {
                return true;
            }
        }
        return false;
    }
}