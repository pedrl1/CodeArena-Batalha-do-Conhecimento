public class Main {
    public static void main (String [] args){
        System.out.println("Bem-vindo à Batalha do Conhecimento!");

        Player player = new Player("", 100, 1, 0);
        RoomManager roomManager = new RoomManager(1);
        BattleManager battleManager = new BattleManager();

        while (true){
            roomManager.nextRoom();
            battleManager.startBattle();
        }


    }

}
