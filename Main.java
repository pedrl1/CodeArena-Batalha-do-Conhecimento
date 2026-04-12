import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        RoomManager room = new RoomManager(1);
        Scanner input = new Scanner(System.in);

        //this mantains the main loop alive until the person decides to leave the game (with the leave game method lmao)
        //now that i thought it can be only on the main menu, its easier

        while (room.roomIndex > 0){
            switch(room.roomIndex){
                /*room 1 = main title
                room 2 = credits
                room 0 = leave game */
                case 1:
                    System.out.println("WELCOME TO CODEARENA!");
                    System.out.println("Start (1)\nCredits(2)\nLeave Game(3)");
            }
        }
    }

}
