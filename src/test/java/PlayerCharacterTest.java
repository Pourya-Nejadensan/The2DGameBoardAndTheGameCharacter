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
    @Test
    public void getYTest_whenMiddle_returnZero(){
        //given

        //when
        int result = PlayerCharacter.getY();
        //then
        assertEquals(0, result);
    }

}
