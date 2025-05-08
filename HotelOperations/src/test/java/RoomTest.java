import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RoomTest {

    //region testing checkIn() method
    @Test
    void dirty_occupied_should_make_roomUnableToCheckIn() {
        Room room = new Room(2, 109.99, true, true); //<--- dirty and occcupied both true
        boolean canCheckIn = room.checkIn();
        //because dirty and occupied are true, checkIn method should return false
        Assertions.assertFalse(canCheckIn);
    }

    @Test
    void checkIn_should_make_roomDirtyAndOccupied() {
        Room room = new Room(2, 109.99, false, false);
        room.checkIn();
        //room should be occupied and dirty
        Assertions.assertTrue(room.isDirty() && room.isOccupied());
    }

    @Test
    void checkIn_should_make_roomUnavailable() {
        Room room = new Room(2, 109.99, true, true);
        room.checkIn();
        Assertions.assertFalse(room.isAvailable());
    }

    @Test
    void checkIn_should_make_roomUnableToClean() {
        Room room = new Room(2, 109.99, true, true);
        room.checkIn();
        boolean roomAbleToClean = room.cleanRoom();
        Assertions.assertFalse(roomAbleToClean);
    }
    //endregion

    //region testing checkOut() method
    @Test
    void checkOut_only_if_checkedIn() {
        Room room = new Room(2, 109.99, false, false);
        boolean canCheckOut = room.checkOut();
        //room is not occupied, so it cant be checkedOut of
        Assertions.assertFalse(canCheckOut);
    }

    @Test
    void checkOut_should_set_occupiedToFalse() {
        Room room = new Room(2, 109.99, true, true);
        room.checkOut();

        Assertions.assertFalse(room.isOccupied);
    }
    //endregion

    //region testing cleanRoom() method
    @Test
    void cleanRoom_only_if_roomDirtyAndNotOccupied() {
        Room room = new Room(2, 109.99, true, false);

        boolean canCleanRoom = room.cleanRoom();

        Assertions.assertFalse(canCleanRoom);
    }

    @Test
    void cleanRoom_should_set_isDirtyToFalse() {
        Room room = new Room(2, 109.99, false, true);
        room.cleanRoom();

        Assertions.assertFalse(room.isDirty);

    }
    //endregion
}