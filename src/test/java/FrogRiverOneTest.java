import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrogRiverOneTest {

    @Test
    public void solution() {
        FrogRiverOne frogRiverOne = new FrogRiverOne();

        assertEquals(6, frogRiverOne.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
        frogRiverOne.solution(  4, new int[]{2,1,4,1});
    }




}