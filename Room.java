/**
 * Created by VINNI on 02.12.16.
 */
import java.util.Date;


public class Room {

    private long id;
    private int price;
    private int persons;
    private String hotelName;
    private String cityName;


    Date dateAvailableFrom = new Date();

    public Room(long id, int price, int persons, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getPersons() {
        return persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (o == this)
            return true;
        if (getClass() != o.getClass())
            return false;

        Room e = (Room) o;

        return this.persons == e.getPersons() &&
                this.price == e.getPrice() &&
                this.cityName.equals(e.getCityName());

    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + persons;
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString()
    {
        return price+" "+" "+persons+" "+hotelName+" "+cityName;
    }
}
