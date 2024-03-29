// LeetCode question 2359
import java.util.Arrays;

public class LeetCode_2359 {
    public static void main(String[] args) {

    }

    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int[] distanceArray1 = getDistanceArray(edges, node1);
        int[] distanceArray2 = getDistanceArray(edges, node2);

        int minDistance = Integer.MAX_VALUE;
        int result = -1;

        for (int i = 0; i < edges.length; i++) {
            if (distanceArray1[i] == -1 || distanceArray2[i] == -1)
                continue;

            int distance = Math.max(distanceArray1[i], distanceArray2[i]);
            if (distance < minDistance) {
                result = i;
                minDistance = distance;
            }
        }
        return result;
    }

    private int[] getDistanceArray(int[] edges, int node) {
        int[] distanceArray = new int[edges.length];
        Arrays.fill(distanceArray, -1);

        int distance = 0;
        while (node != -1 && distanceArray[node] == -1) {
            distanceArray[node] = distance++;
            node = edges[node];
        }
        return distanceArray;
    }

}
