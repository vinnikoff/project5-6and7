/**
 * Created by VINNI on 03.12.16.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.requestRooms(2, 3, "q", "w");


        controller.check2(new BookingComAPI(), new GoogleAPI());


        //Room[] roomsoutcheck = new Room[1000];
        //roomsoutcheck=controller.check(roomsout);
       //System.out.println(Arrays.toString(roomsoutcheck));

        //roomsoutcheck2=controller.check2(apis1, apis2);






    }

}





