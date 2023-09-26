import java.util.*;
public class DepthFirstSearch{

    static Map<Integer, List<Integer>> adjList = new HashMap<>();
    static Map<Integer, Boolean> visited = new HashMap<>();

    static void addEdge(int u, int v, boolean direction) {
        if (!adjList.containsKey(u)) {
            adjList.put(u, new ArrayList<>());
        }
        adjList.get(u).add(v);
        
        if (!direction) { // For undirected graph
            if (!adjList.containsKey(v)) {
                adjList.put(v, new ArrayList<>());
            }
            adjList.get(v).add(u);
        }
    }

    static void dfs(int start) {
        visited.put(start, true);
        System.out.print(start+",");

        for (int neighbor : adjList.getOrDefault(start, new ArrayList<>())) {
            if (!visited.getOrDefault(neighbor, false)) {
                dfs(neighbor);
            }
        }
    }

    public static void main(String[] args){
        addEdge(0, 1,false);
        addEdge(1, 6,false);
        addEdge(1, 4,false);
        addEdge(4, 5,false);
        addEdge(4, 3,false);
        addEdge(3, 2,false);
        addEdge(3, 7,false);

        System.out.println("Depth-First Traversal (starting from vertex 0):");
        dfs(0);
    }
}

