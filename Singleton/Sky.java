import java.util.ArrayList;
import java.util.List;

class Sky {
    private static Sky instance;
    private List<String> starNames;

    private Sky() {
        starNames = new ArrayList<>();
    }

    public static synchronized Sky getInstance() {
        if (instance == null) {
            instance = new Sky();
        }
        return instance;
    }

    public List<String> getStarNames() {
        return starNames;
    }
}

public class TestSky {
    public static void main(String[] args) {
        Sky test = Sky.getInstance();
        System.out.println(test.getStarNames());
    }
}
