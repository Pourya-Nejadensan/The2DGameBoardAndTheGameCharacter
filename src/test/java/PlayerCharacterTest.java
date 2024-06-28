import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerCharacterTest {
    @Test
    public void getXTest_whenMiddle_returnZero(){
        //given

        //when
        int result = PlayerCharacter.getX();
        //then
        assertEquals(0, result);
    }
}
