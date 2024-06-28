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

    @Test
    public void moveTest_whenArgumentW_returnYisOne(){
        //given
        String movement = "W";
        //when
        int result = PlayerCharacter.move(movement);
        //then
        assertEquals(1, result);
    }
    @Test
    public void moveTest_whenArgumentS_returnYisMinusOne(){
        //given
        String movement = "S";
        //when
        int result = PlayerCharacter.move(movement);
        //then
        assertEquals(-1, result);
    }

}
