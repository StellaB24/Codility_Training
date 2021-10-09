public class BinaryGap {

    /**
     * given a positive integer N, returns the length of its longest binary gap.
     * The function should return 0 if N doesn't contain a binary gap.
     */
    public int solution(int n) {
        int counter = 0;
        int maxCounter = 0;

        boolean started = false;
        String binaryString = Integer.toBinaryString(n);

        for (int i = 0; i < binaryString.length(); i++) {
            String substring = binaryString.substring(i, i + 1);
            if (substring.equals("1")) {
                if (started) {
                    if (counter > maxCounter) {
                        maxCounter = counter;
                        counter = 0;
                    }
                }
                started = true;
                counter = 0;
            }
            if (substring.equals("0")) {
                counter++;
            }
        }
        return maxCounter;
    }
}
