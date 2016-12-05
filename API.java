/**
 * Created by VINNI on 02.12.16.
 */
public interface API {

    abstract Room[] findRooms(int price, int persons, String city, String hotel);

    abstract Room[] getAllRoom();

}
