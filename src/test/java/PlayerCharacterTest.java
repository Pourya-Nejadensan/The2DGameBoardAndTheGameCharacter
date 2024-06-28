import org.junit.jupiter.api.Test;

public class PlayerCharacterTest {
    @Test
    public void getXTest_whenMiddle_returnZero(){
        //given

        //when
        int result = getX();
        //then
        assertEqual(0, result);
    }

}
