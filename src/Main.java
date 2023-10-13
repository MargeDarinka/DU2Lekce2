import com.engeto.guest.Guest;
import com.engeto.guest.com.engeto.room.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Guest guest1 = new Guest( "Adéla Malíková",
                LocalDate.of(1993,3,13)
                );
        Guest guest2 = new Guest("Jan Dvořéček",
                LocalDate.of(1995,5,5)
                );
        System.out.println("Jméno hosta: "+guest1.getCeleJmeno()+ " Datum narození: "+guest1.getDatumNarozeni());
        System.out.println("Jméno hosta: "+guest2.getCeleJmeno()+ " Datum narození: "+guest2.getDatumNarozeni());

        List<Guest> guestList = new ArrayList<>();
            guestList.add(guest1);
            guestList.add(guest2);


        Room room1 = new Room(1,1,true,
                true,1000
                );
        Room room2 = new Room(2,1,true,
                true,1000
                );
        Room room3 = new Room(3,3,false,
                true,2400
                );



        List<Room> roomList = new ArrayList<>();
            roomList.add(room1);
            roomList.add(room2);
            roomList.add(room3);



    }

}