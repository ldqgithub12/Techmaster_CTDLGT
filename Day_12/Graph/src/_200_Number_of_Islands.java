public class _200_Number_of_Islands {
    public static int numIslands(char[][] grid) {
        int count = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i=0;i< grid.length;i++){
            for (int j = 0;j<grid[0].length;j++){
                if (!visited[i][j] && grid[i][j] == '1'){
                    count++;
                    DFS(grid,visited,i,j);
                }
            }
        }
        return count;
    }

    private static void DFS(char[][] graph, boolean[][] visited,int i, int j){
        if (!isValid(graph, i, j)){
            return;
        }
        if (graph[i][j] == '1' && !visited[i][j]){
            visited[i][j] = true;
            DFS(graph, visited, i-1, j);
            DFS(graph, visited, i+1, j);
            DFS(graph, visited, i, j+1);
            DFS(graph, visited, i, j-1);
        }
    }
    private static boolean isValid(char[][] graph,int i, int j){
        return i>0 && i< graph.length && j>0 && j < graph[0].length;
    }
    public static void main(String[] args) {

    }
}
