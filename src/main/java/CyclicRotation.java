public class CyclicRotation {

    /**
     * An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index,
     * and the last element of the array is moved to the first place.
     * given an array A consisting of N integers and an integer K, returns the array A rotated K times.
     */

    public int[] solution(int[] A, int K) {

        if (A.length == 0) {
            return A;
        }

        if (K <= 0) {
            return null;
        }

        int timesToRotate = K;
        if (K > A.length) {
            timesToRotate = K % A.length;
        }

        int[] tempArray = new int[A.length];
        int startIndex = A.length - timesToRotate;

        int index = 0;
        for (int i = startIndex; i < A.length; i++) {
            tempArray[index] = A[i];
            index++;
        }
        for (int i = 0; i < startIndex; i++) {
            tempArray[index] = A[i];
            index++;
        }
        return tempArray;
    }
}
