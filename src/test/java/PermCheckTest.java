import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermCheckTest {

    @Test
    void test() {
        PermCheck permCheck = new PermCheck();
        assertEquals(1, permCheck.solution(new int[]{4, 1, 3, 2}));
        assertEquals(0, permCheck.solution(new int[]{4, 1, 3}));
    }
}