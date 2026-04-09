public class Room {
    int roomIndex = 0;

    public Room(int roomIndex){
        this.roomIndex = roomIndex;
    }

    public void roomAdvance(){
        roomIndex++;
    }

    public void roomGoBack(){ 
        roomIndex--;
    }

}
