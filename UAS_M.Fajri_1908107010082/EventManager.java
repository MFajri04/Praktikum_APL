import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Kelas penerbit dasar mencakup manajemen langganan
//kode dan metode notifikasi.
public class EventManager {
    Map<String, List<EventFashion>> fashions = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.fashions.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventFashion fashion) {
        List<EventFashion> users = fashions.get(eventType);
        users.add(fashion);
    }

    public void unsubscribe(String eventType, EventFashion fashion) {
        List<EventFashion> users = fashions.get(eventType);
        users.remove(fashion);
    }

    public void notify(String eventType, File file) {
        List<EventFashion> users = fashions.get(eventType);
        for (EventFashion fashion : users) {
            fashion.update(eventType, file);
        }
    }
}