import java.util.HashMap;
import java.util.Map;

public class set_2 {
    private static final Object obj = new Object();
    Map<people, Object> items = new HashMap<>();

    public boolean add(people person) {
        return items.putIfAbsent(person, obj) == null;

    }
}