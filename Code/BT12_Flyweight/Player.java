public class Player {
    private String name;
    private int number;
    private String position;
    private Team team; // Reference to shared team information

    public Player(String name, int number, String position, Team team) {
        this.name = name;
        this.number = number;
        this.position = position;
        this.team = team;
    }

    public String getInfo() {
        return "Player: " + name +
                ", Number: " + number +
                ", Position: " + position +
                "\n" + team.getTeamInfo();
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public Team getTeam() {
        return team;
    }
}