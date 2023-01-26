import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class LeetCode_787{
    public static void main(String[] args) {
        
    }
        public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
            
            // Build graph
            // node -> [[neighbor,distance]]
            Map<Integer, List<int[]>> graph = new HashMap<>();
            for(int i = 0; i < n; i++) graph.put(i, new ArrayList<>());
            
            for(int[] flight : flights) {
                int u = flight[0];
                int v = flight[1];
                int w = flight[2];
                graph.get(u).add(new int[] {v, w});
            }
            
            // int[] -> [node, distance, moves] for every index
            Queue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
            int[] distance = new int[n];
            Arrays.fill(distance, -1);
    
            int[] maxMovesUpToNode = new int[n];
            Arrays.fill(maxMovesUpToNode, Integer.MAX_VALUE);
    
            // Initial mark
            distance[src] = 0;
            pq.offer(new int[] {src, 0, 0});
            
            // Run Relaxation Algorithm
            while(!pq.isEmpty()) {
                int[] element = pq.poll();
                int node = element[0];
                int dis = element[1];
                int moves = element[2];
    
                if(maxMovesUpToNode[node] < moves) continue;
                maxMovesUpToNode[node] = moves;
                
                for(int[] edge : graph.get(node)) {
                    int neighbor = edge[0], weight = edge[1];
                    
                    int neighborNewDistance = weight + dis;
                    if(distance[neighbor] == -1 || neighborNewDistance < distance[neighbor]) {
                        distance[neighbor] = neighborNewDistance;
                    }
                    // If we have moves left.
                    if(k != moves) {
                        pq.offer(new int[] {neighbor, neighborNewDistance, moves + 1});
                    }
                }
            }
            
            
            return distance[dst];
        }
    
}