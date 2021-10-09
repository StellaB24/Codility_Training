import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogJmpTest {

    @Test
    void solution() {
        FrogJmp frogJmp = new FrogJmp();
        assertEquals(3, frogJmp.solution(10, 85, 30));
        assertEquals(24, frogJmp.solution(12, 82, 3));
    }
}