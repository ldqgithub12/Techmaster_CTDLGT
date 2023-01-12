import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DepthFirstSearch {
    public static void main(String[] args) {
        int[][] graph =
                {
                        {0, 1, 0, 0, 0, 0},
                        {1, 0, 1, 1, 0, 0},
                        {0, 1, 0, 0, 1, 0},
                        {0, 1, 0, 0, 1, 1},
                        {0, 1, 0, 0, 0, 1},
                        {0, 0, 1, 0, 0, 0},
                        {0, 0, 1, 1, 0, 0},
                };
        boolean[] visited = new boolean[graph.length];
//        traversalByStack(graph);
        DFS(0,graph,visited);
    }
    private static void traversalByStack(int[][] graph){
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[graph.length];
        stack.push(0);
        visited[0] = true;
        while (!stack.isEmpty()){
            int u = stack.pop();
            System.out.println(u+" ");
            for (int v = 0;v<graph.length;v++){
                if (graph[u][v] == 1 && !visited[v]){
                    stack.push(v);
                    visited[v] = true;
                }
            }
        }
    }

    private static void DFS(int u, int[][] graph, boolean[] visited){
        System.out.print(u+" ");
        visited[u] = true;
        for (int v = graph.length-1;v>=0;v--){
            if (graph[u][v] == 1 && !visited[v]){
                DFS(v,graph,visited);
            }
        }
    }
    private static void BFS(int[][] graph){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.length];
        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()){
            int u = queue.poll();
            System.out.print(u + " " );
            for (int v = 0; v< graph.length;v++){
                if (graph[u][v] == 1 && !visited[v]){
                    queue.add(v);
                    visited[v] = true;
                }
            }
        }
    }
}
