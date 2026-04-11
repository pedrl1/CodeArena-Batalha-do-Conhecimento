public class RoomManager {

    int roomIndex;

    //constructor of fucking course
    public RoomManager(int roomIndex){
        this.roomIndex = roomIndex;
    }

    //useful for a play button or go to next room
    public static void nextRoom(int roomIndex){
        roomIndex++;
    } 

    //go back (like a pause or walk back)
    public static void previousRoom(int roomIndex){
        roomIndex--;
    }

    //useful for a main menu goer method (PLEASE WORK CAUSE THIS SEEMS FUCKING STUPID)
    public static void resetRoomIndex(int roomIndex){
        roomIndex = 1;
    }



}
