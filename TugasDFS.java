import java.util.*;

public class TugasDFS {

    private Map<String, List<String>> graph = new HashMap<>();

    public DFS() {
        graph.put("a0", Arrays.asList("a1", "a2"));
        graph.put("a1", Arrays.asList("a3", "a4"));
        graph.put("a2", Arrays.asList("a5", "a6"));
        graph.put("a3", Arrays.asList("a7"));
        graph.put("a4", Arrays.asList("a8"));
        graph.put("a5", Arrays.asList("a9"));
        graph.put("a6", new ArrayList<>());
        graph.put("a7", new ArrayList<>());
        graph.put("a8", new ArrayList<>());
        graph.put("a9", new ArrayList<>());
    }

    public void dfs(String start, String target) {
        Set<String> visited = new HashSet<>();
        dfsRecursive(start, target, visited);
    }

    private boolean dfsRecursive(String node, String target, Set<String> visited) {

        System.out.println("Kunjungi : " + node);

        if (node.equals(target)) {
            System.out.println("Target ditemukan : " + target);
            return true;
        }

        visited.add(node);

        for (String neighbor : graph.get(node)) {
            if (!visited.contains(neighbor)) {
                if (dfsRecursive(neighbor, target, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        TugasDFS g = new TugasDFS();
        g.dfs("a0", "a9");
    }
}
