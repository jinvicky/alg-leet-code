class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);

        dfs(graph, 0, path, result);

        return result;
    }

    private void dfs(int[][] graph, int node, List<Integer> path, List<List<Integer>> result) {
        // 종료 조건: 목표노드에 도달했을 때 
        if(node == graph.length - 1) {
            result.add(new ArrayList<>(path)); // 경로 저장(복사)
            return;
        }

        for(int next : graph[node]) {
            path.add(next);
            dfs(graph, next, path, result);
            path.remove(path.size() - 1);
        }
    }
}