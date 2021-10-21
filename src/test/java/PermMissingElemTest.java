import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermMissingElemTest {

    @Test
    void solution() {
        PermMissingElem permMissingElem = new PermMissingElem();
        //assertEquals(4, permMissingElem.solution(new int[]{2, 3, 1, 5}));
        //assertEquals(1, permMissingElem.solution(new int[]{2, 3, 4, 5}));
        assertEquals(5, permMissingElem.solution(new int[]{2, 3, 4, 1}));
        assertEquals(1, permMissingElem.solution(new int[]{}));
        assertEquals(2, permMissingElem.solution(new int[]{1}));
        assertEquals(6, permMissingElem.solution(new int[]{1,2,3,4,5,7}));

    }
}