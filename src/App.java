import board.Board;
import player.Player;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("-----TIC TAC TOE-----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:\n 1.Size of Board\n 2.Symbol of Board ");
        int sz = sc.nextInt();
        char sym = sc.next().charAt(0);
        Board b = new Board(sz,sym);
        b.printBoard();

        Player p1 = new Player();
        System.out.println("Enter\n 1.Name of Player1\n 2.Symbol of Player1\n 3.Number of Player1\n 4.Emailid of Player1 ");
        sc.nextLine();
        String nam = sc.nextLine();
        char sym1 = sc.nextLine().charAt(0);
        String num = sc.nextLine();
        String emailid = sc.nextLine();
        p1.setDetails(nam,sym1,num,emailid);
        p1.getDetails();
        
        Player p2 = new Player();
        System.out.println("Enter\n 1.Name of Player2\n 2.Symbol of Player2\n 3.Number of Player2\n 4.Emailid of Player2 ");
        String nam1 = sc.nextLine();
        char sym2 = sc.nextLine().charAt(0);
        String num1 = sc.nextLine();
        String emailid1 = sc.nextLine();
        p2.setDetails(nam1, sym2,num1,emailid1);
        p2.getDetails();
    }
}
