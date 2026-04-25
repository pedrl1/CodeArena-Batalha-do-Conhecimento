public class RoomManager {
    
    private int roomIndex;
    
    public RoomManager(int initialRoom) {
        this.roomIndex = initialRoom;
    }
    
    public void nextRoom() {
        this.roomIndex++;
    }
    
    public void previousRoom() {
        this.roomIndex--;
    }
    
    public void goToRoom(int roomIndex) {
        this.roomIndex = roomIndex;
    }
    
    public void resetToMainMenu() {
        this.roomIndex = 1;
    }
    
    public void exitGame() {
        this.roomIndex = 0;
    }
    
    public int getCurrentRoom() {
        return roomIndex;
    }
}
