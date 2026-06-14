import java.util.*;

public class TugasBFS {

    private Map<String, List<String>> graph = new HashMap<>();

    public TugasBFS() {
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

    public void bfs(String start, String target) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            String node = queue.poll();

            System.out.println("Kunjungi : " + node);

            if (node.equals(target)) {
                System.out.println("Target ditemukan : " + target);
                return;
            }

            for (String neighbor : graph.get(node)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        System.out.println("Target tidak ditemukan");
    }

    public static void main(String[] args) {
        TugasBFS g = new TugasBFS(); 
        g.bfs("a0", "a9");   
    }
}