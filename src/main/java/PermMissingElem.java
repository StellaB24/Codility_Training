public class PermMissingElem {

    /**
     * An array A consisting of N different integers is given.
     * The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
     * Your goal is to find that missing element.
     */
    public int solution(int[] A) {
        quickSort(A, 0, A.length - 1);
        int missing = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i-1] != i) {
                missing = i;
                break;
            }
        }
        return missing;
    }

    public void quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

}
