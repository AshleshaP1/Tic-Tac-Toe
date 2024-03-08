package player;

public class Player {
    private String name;
    private char symbol;
    private String number;
    private String email;

    public void setPlayer(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public void setDetails(String name, char symbol, String number, String email) {
        this.name = name;
        this.symbol = symbol;
        this.number = number;
        this.email = email;
    }
 
    public void getPlayer() {
        System.out.println("Name: " + this.name);
        System.out.println("Symbol: " + this.symbol);
    }
    
    public void getDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Symbol: " + this.symbol);
        System.out.println("Number: " + this.number);
        System.out.println("Email Id:"+ this.email);
    }
}
