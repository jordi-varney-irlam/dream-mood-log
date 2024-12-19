import java.time.LocalDateTime;

public class MoodLog {
    private LocalDateTime timestamp;  // Date and time of the log
    private String mood;             // Mood description
    private int intensity;           // Intensity on a scale of 1 to 10

    public MoodLog(LocalDateTime timestamp, String mood, int intensity) {
        this.timestamp = timestamp;
        this.mood = mood;
        this.intensity = intensity;
    }

    // Getters and setters
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getMood() {
        return mood;
    }

    public int getIntensity() {
        return intensity;
    }

    @Override
    public String toString() {
        return "MoodLog{" +
                "timestamp=" + timestamp +
                ", mood='" + mood + '\'' +
                ", intensity=" + intensity +
                '}';
    }
}

