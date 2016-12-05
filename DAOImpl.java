/**
 * Created by VINNI on 03.12.16.
 */
public class DAOImpl implements DAO {

    @Override
    public Room save(Room room) {
        System.out.println("save " + room.toString());
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("delete " + room.toString());
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("update " + room.toString());
        return room;
    }

    @Override
    public Room findById(long id) {
        System.out.println("find by Id " + id);
        return null;
    }

}
