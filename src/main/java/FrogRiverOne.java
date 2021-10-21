import java.util.HashSet;

public class FrogRiverOne {
    public int solution(int X, int[] A) {

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 1; i < X; i++) {
            hashSet.add(i);
        }

        for (int i = 0; i < A.length; i++) {
            if (hashSet.remove(A[i])) {
                if (hashSet.isEmpty()) {
                    return i;
                }
            }
        }
        return -1;
    }

}
