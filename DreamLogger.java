import java.io.*;
import java.time.LocalDateTime;

public class DreamLogger {
    public static void saveDreamLog(DreamLog dreamLog) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("dream_logs.csv", true))) {
            writer.write(dreamLog.getTimestamp() + "," + dreamLog.getDescription() + "," + dreamLog.getMoodInDream() + "," + dreamLog.getIntensity() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

