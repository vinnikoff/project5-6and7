/**
 * Created by VINNI on 03.12.16.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Room[] roomsout = new Room[controller.getLenght()];
        Room[] roomsoutcheck = new Room[1000];

        roomsout=controller.requestRooms(2, 3, "q", "w");
        roomsoutcheck=controller.check(roomsout);
        System.out.println(Arrays.toString(roomsoutcheck));

    }

}





