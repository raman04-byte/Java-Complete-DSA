package GFGPOTD;
// GeeksforGeeks Problem Date: Jan 20
public class Jan_20 {
    public static void main(String[] args) {

    }

    public int maxWeightCell(int N, int Edge[]) {
        int[] weights = new int[N];
        int maxWeight = 0;
        int maxWeightCell = -1;

        // calculate the weights of all cells
        for (int i = 0; i < N; i++) {
            if (Edge[i] != -1) {
                weights[Edge[i]] += i;
            }
        }

        // find the cell with maximum weight
        for (int i = 0; i < N; i++) {
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
                maxWeightCell = i;
            } else if (weights[i] == maxWeight) {
                maxWeightCell = Math.max(maxWeightCell, i);
            }
        }

        return maxWeightCell;
    }

}