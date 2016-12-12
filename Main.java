/**
 * Created by VINNI on 03.12.16.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.requestRooms(2, 3, "q", "w");
        controller.requestRooms(9, 6, "e", "r");
        controller.requestRooms(14, 12, "u", "i");

        controller.check2(new BookingComAPI(), new GoogleAPI());
        controller.check2(new BookingComAPI(), new TripAdvisorAPI());
        controller.check2(new TripAdvisorAPI(), new GoogleAPI());



        //Room[] roomsoutcheck = new Room[1000];
        //roomsoutcheck=controller.check(roomsout);
       //System.out.println(Arrays.toString(roomsoutcheck));

        //roomsoutcheck2=controller.check2(apis1, apis2);






    }

}





