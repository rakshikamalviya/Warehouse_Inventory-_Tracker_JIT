import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EventLogger {
    public void log(String message) {
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("[LOG " + time + "] " + message);
    }
}
