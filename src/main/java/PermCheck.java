import java.util.HashSet;

public class PermCheck {
    public int solution(int[] A) {
        int N = A.length;

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            hashSet.add(i);
        }

        for (int i = 0; i <A.length; i++) {
            if (hashSet.remove(A[i])) {
                if (hashSet.isEmpty()) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
