public class Main {
    public static void main (String [] args){
        //room manager so we can change screens whenever we like
        Room roomManager = new Room(0);

        //if the player clicks the exit button, roomIndex will be < 0 and the game will close
        //its the main loop condition to exist
        while (roomManager.roomIndex > 0){
            switch(roomManager.roomIndex){
                case 1:
                    System.out.println("CODEARENA: BATALHA DO CONHECIMENTO");
                    System.out.println("Deseja começar o jogo? (y/n)");
                    

            }
        }

    }
    
}
