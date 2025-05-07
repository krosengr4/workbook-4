import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RoomTest {

    @Test
    void checkIn() {
        Room room = new Room(2, 109.99, false, false);

        room.checkIn();

        //room should be occupied and dirty
        Assertions.assertTrue(room.isDirty() && room.isOccupied());
        //room should be unavailable
        Assertions.assertFalse(room.isAvailable());
        //room should not be able to clean
        Assertions.assertFalse(room.canClean());
        //room should not be able to check in
        Assertions.assertFalse(room.checkIn());
    }

    @Test
    void checkOut() {
        Room room = new Room(2, 109.99, true, true);

        room.checkOut();

        //room should be dirty but not occupied
        Assertions.assertTrue(room.isDirty());
        Assertions.assertFalse(room.isOccupied());
        //room should be unavailable
        Assertions.assertFalse(room.isAvailable());
        //room should be able to clean
        Assertions.assertTrue(room.canClean());
    }

    @Test
    void cleanRoom() {
        Room room = new Room(2, 109.99, false, true);

        room.cleanRoom();

        //Should return not occupied and not dirty
        Assertions.assertFalse(room.isOccupied() && room.isDirty());
        // room should be available
        Assertions.assertTrue(room.isAvailable());
        // room should not be able to clean
        Assertions.assertFalse(room.canClean());
    }
}