import java.util.Arrays;

/**
 * Created by VINNI on 03.12.16.
 */
import java.util.*;

public class Controller {
    private BookingComAPI bookingComAPI = new BookingComAPI();
    private GoogleAPI googleAPI = new GoogleAPI();
    private TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
    API apis[] = {bookingComAPI, googleAPI, tripAdvisorAPI};
    int lenghtres;

    public Controller() {

    }

    Room[] requestRooms(int price, int persons,  String hotel, String city) {

        Room[] result1 = apis[0].findRooms(price, persons, hotel, city);
        Room[] result2 = apis[1].findRooms(price, persons, hotel, city);
        Room[] result3 = apis[2].findRooms(price, persons, hotel, city);

        Room[] result4 = new Room[result1.length + result2.length];
        System.arraycopy(result1, 0, result4, 0, result1.length);
        System.arraycopy(result2, 0, result4, result1.length, result2.length);

        Room[] result5 = new Room[result3.length + result4.length];
        System.arraycopy(result3, 0, result5, 0, result3.length);
        System.arraycopy(result4, 0, result5, result3.length, result4.length);
        lenghtres=result5.length;

        return result5;

    }



    public int getLenght() {
        return lenghtres;
    }


   /** Room[] check(Room[] values) {
        boolean mask[] = new boolean[values.length];
        int removeCount = 0;
        Room[] tmp = new Room[5];

        for (int i = 0; i < values.length; i++) {
            if (!mask[i]) {
                tmp[0] = values[i];

                for (int j = i + 1; j < values.length; j++) {
                    if (tmp[0].equals(values[j])) {
                        mask[j] = true;
                        removeCount++;
                    }
                }
            }
        }

        Room[] result = new Room[values.length - removeCount];

        for (int i = 0, j = 0; i < values.length; i++) {
            if (!mask[i]) {
                result[j++] = values[i];
            }
        }
        System.out.println("Одинаковых номеров (все API): " + mask.length);
        return result;
    }
    */


    Room[] check2(API api1, API api2) {
        Room[] apiout1=api1.getAllRoom();
        Room[] apiout2=api2.getAllRoom();
        int lengthOut;
        if (apiout2.length>apiout1.length) lengthOut= apiout2.length;
        else lengthOut=apiout1.length;
        Room[] apioutAll= new Room[lengthOut];
        int countApioutAll=0;

        for (int i = 0; i < apiout1.length; i++)
        {
            for (int j = 0; j < apiout2.length; j++)
            {
                if (apiout1[i].equals(apiout2[j])) {
                    apioutAll[countApioutAll]=apiout1[i];
                    countApioutAll++;
                }
            }
        }


        int removeCount=0;
        boolean mask[] = new boolean[lengthOut];
        for (int m = 0; m < lengthOut; m++) {
                    if (apioutAll[m]!=null) {
                        mask[m] = true;
                        removeCount++;
                    }
                }


        Room[] result = new Room[removeCount];

        for (int i = 0, j = 0; i < lengthOut; i++) {
            if (mask[i]) {
                result[j++] = apioutAll[i];
            }
        }

        return result;
    }




    @Override
    public String toString() {
        return "Controller{" +
                "bookingComAPI=" + bookingComAPI +
                ", googleAPI=" + googleAPI +
                ", tripAdvisorAPI=" + tripAdvisorAPI +
                ", apis=" + Arrays.toString(apis) +
                '}';
    }
}
