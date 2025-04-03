import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    private static final Map<String, Team> teams = new HashMap<>();

    public static Team getTeam(String teamName, String logo, String color) {
        // Kiểm tra xem team đã tồn tại chưa
        String key = teamName + "-" + logo + "-" + color;

        // Nếu team chưa tồn tại, tạo mới và lưu vào Map
        if (!teams.containsKey(key)) {
            teams.put(key, new Team(teamName, logo, color));
        }

        return teams.get(key);
    }

    public static Player createPlayer(String name, int number, String position,
            String teamName, String logo, String color) {
        // Lấy hoặc tạo team
        Team team = getTeam(teamName, logo, color);
        // Tạo player mới với team được chia sẻ
        return new Player(name, number, position, team);
    }

    // Phương thức để lấy số lượng team đã được tạo
    public static int getTeamCount() {
        return teams.size();
    }
}