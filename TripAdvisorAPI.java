import java.util.Arrays;

/**
 * Created by VINNI on 02.12.16.
 */
public class TripAdvisorAPI implements API {
    private Room[] rooms = new Room[5];
    private Room[] roomsfind = new Room[5];
    public TripAdvisorAPI() {
        Room room1 = new Room(3, 2, 3, "q", "w");
        rooms[0] = room1;
        Room room2 = new Room(4, 9, 6, "e", "r");
        rooms[1] = room2;
        Room room3 = new Room(7, 8 , 9, "t", "y");
        rooms[2] = room3;
        Room room4 = new Room(10, 11, 12, "u", "i");
        rooms[3] = room4;
        Room room5 = new Room(13,14,15, "o", "p");
        rooms[4] = room5;
    }

    @Override
    public Room[] findRooms(int price, int persons, String hotel, String city)
    {
        int j=0;
        for (int i=0; i<5; i++)
        {
            Room e4 = new Room(rooms[i].getId(), rooms[i].getPrice(), rooms[i].getPersons(), rooms[i].getHotelName(), rooms[i].getCityName());
            Room e5 = new Room(100, price, persons, hotel, city);

            if (e4.equals(e5)) {
                roomsfind [j]=e4;
                j++;}
        }

        Room[] result = new Room[j];
        System.arraycopy(roomsfind, 0, result, 0, j);

        return result;
    }


    @Override
    public Room[] getAllRoom() {
        return rooms;
    }

    @Override
    public String toString() {
        return "TripAdvisorAPI{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }
}