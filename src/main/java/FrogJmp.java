public class FrogJmp {

    /**
     * A small frog wants to get to the other side of the road.
     * The frog is currently located at position X and wants to get to a position greater than or equal to Y.
     * The small frog always jumps a fixed distance, D.
     * Count the minimal number of jumps that the small frog must perform to reach its target.
     */

    public int solution(int X, int Y, int D) {
        if (X == Y) {
            return 0;
        }
        int steps = (Y - X);
        if (steps % D != 0) {
            return steps / D + 1;
        } else return steps / D;
    }
}
