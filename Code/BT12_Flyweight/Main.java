public class Main {
    public static void main(String[] args) {
        // Tạo các cầu thủ từ cùng một đội
        Player player1 = PlayerFactory.createPlayer(
                "Ronaldo", 7, "Forward",
                "Manchester United", "MU_logo.png", "Red");

        Player player2 = PlayerFactory.createPlayer(
                "Bruno", 8, "Midfielder",
                "Manchester United", "MU_logo.png", "Red");

        // Tạo cầu thủ từ đội khác
        Player player3 = PlayerFactory.createPlayer(
                "Messi", 10, "Forward",
                "PSG", "PSG_logo.png", "Blue");

        // In thông tin các cầu thủ
        System.out.println("Player 1 Info:");
        System.out.println(player1.getInfo());
        System.out.println("\nPlayer 2 Info:");
        System.out.println(player2.getInfo());
        System.out.println("\nPlayer 3 Info:");
        System.out.println(player3.getInfo());

        // In số lượng đội đã được tạo
        System.out.println("\nTotal number of team objects created: " + PlayerFactory.getTeamCount());
    }
}