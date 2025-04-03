public class Team {
    private String teamName;
    private String logo;
    private String color;

    public Team(String teamName, String logo, String color) {
        this.teamName = teamName;
        this.logo = logo;
        this.color = color;
    }

    public String getTeamInfo() {
        return "Team: " + teamName + ", Logo: " + logo + ", Color: " + color;
    }

    // Getters
    public String getTeamName() {
        return teamName;
    }

    public String getLogo() {
        return logo;
    }

    public String getColor() {
        return color;
    }
}