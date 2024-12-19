import java.io.*;
import java.time.LocalDateTime;

public class MoodLogger {
    public static void saveMoodLog(MoodLog moodLog) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("mood_logs.csv", true))) {
            writer.write(moodLog.getTimestamp() + "," + moodLog.getMood() + "," + moodLog.getIntensity() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

