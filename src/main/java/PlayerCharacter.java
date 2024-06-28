public class PlayerCharacter {
    public static int getX() {
        return 0;
    }
    public static int getY() {return 0; }
    public static int move(String direction) {
        if(direction.equals("W")) {
            return 1;
        }
        else if(direction.equals("S")) {
            return -1;
        }
        return 0;

    }
}
