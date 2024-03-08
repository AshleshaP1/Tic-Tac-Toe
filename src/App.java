import board.Board;
import player.Player;
import game.Game;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-----TIC TAC TOE-----");
        Board b = new Board(3,'-');
        b.printBoard();

        Player p1 = new Player();
        p1.setPlayer("Kanha",'X');
        p1.getPlayer();
        System.out.println();
        
        Player p2 = new Player();
        p2.setPlayer("shiv",'O');
        p2.getPlayer();

        Game game = new Game(new Player[] { p1, p2 }, b);
        game.play();

      
    }
}
