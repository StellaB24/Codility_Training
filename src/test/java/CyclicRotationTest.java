import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {

    @Test
    void solution() {
        CyclicRotation cyclicRotation = new CyclicRotation();

        assertArrayEquals(cyclicRotation.solution(new int[]{1,2,3,4,5}, 26), new int[]{5,1,2,3,4});
        assertEquals(cyclicRotation.solution(new int[]{3, 5, 6, 3, 5}, 0), null);
        assertArrayEquals(cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3), new int[]{9, 7, 6, 3, 8});
        assertArrayEquals(cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 5), new int[]{3, 8, 9, 7, 6});
        assertArrayEquals(cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 10), new int[]{3, 8, 9, 7, 6});
        assertArrayEquals(cyclicRotation.solution(new int[]{5,5,5}, 1), new int[]{5,5,5});
        assertEquals(cyclicRotation.solution(new int[]{5,-5,5}, -3), null);
        assertArrayEquals(cyclicRotation.solution(new int[]{5,-5,5}, 3), new int[]{5,-5,5});
        assertArrayEquals(cyclicRotation.solution(new int[]{1,2,3,4,5}, 5), new int[]{1,2,3,4,5});
        assertArrayEquals(cyclicRotation.solution(new int[]{1,2,3,4,5}, 25), new int[]{1,2,3,4,5});


    }
}