import java.util.HashMap;
import java.util.Map;

public class EntertainmentManager {
    private final Map<String, EntertainmentProgram> prototypes = new HashMap<>();
    public EntertainmentManager(){
        prototypes.put("movie", new Movie("I Love You", 120, "ABC"));
        prototypes.put("tvshow", new TVShow("WWTBAM", 60, 100));
        prototypes.put("musicevent", new MusicEvent("ATVNCG", 240, "Yeah1"));
    }

    public EntertainmentProgram getClonedProgram(String type){
        EntertainmentProgram prototype = prototypes.get(type.toLowerCase());
        if (prototype != null){
            return prototype.clone();
        }
        throw new IllegalArgumentException("Invalid program type: " + type);
    }
}
