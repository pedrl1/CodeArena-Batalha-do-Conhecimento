public class Main {
    public static void main (String [] args){
        RoomManager room = new RoomManager(0);

        //this mantains the main loop alive until the person decides to leave the game (with the leave game method lmao)
        //now that i thought it can be only on the main menu, its easier

        while (room.roomIndex > 0){
            switch(room.roomIndex){
                /*room 1 = main title
                room 0 = credits
                room -1 = leave game */
                case 0:
                    System.out.println("WELCOME TO CODEARENA!");
                    System.out.println("Start (1)\nLeave Game(2)\nCredits(3)");
            }
        }
    }

}
