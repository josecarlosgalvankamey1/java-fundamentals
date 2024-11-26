import java.util.HashMap;
import java.util.Map;

public class Team {

    private String name;
    private Map<String, String> players;

    public Team(String name) {
        this.name = name;
        players = new HashMap<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.isBlank() || name == null) {
            throw new IllegalArgumentException("The name cannot be null or blank.");
        }
        this.name = name;
    }

    public String getPlayer(String position) {
        if (position.isBlank() || position == null) {
            throw new IllegalArgumentException("The position cannot be null or blank.");
        }
        return this.players.get(position);
    }

    public void setPlayer(String position, String player) {
        this.players.put(position, player);
    }

}
