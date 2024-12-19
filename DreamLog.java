import java.time.LocalDateTime;

public class DreamLog {
    private LocalDateTime timestamp;    // Date and time of the dream
    private String description;         // Dream description
    private String moodInDream;         // Mood felt during the dream
    private int intensity;              // Intensity of the mood in the dream (scale of 1-10)

    public DreamLog(LocalDateTime timestamp, String description, String moodInDream, int intensity) {
        this.timestamp = timestamp;
        this.description = description;
        this.moodInDream = moodInDream;
        this.intensity = intensity;
    }

    // Getters and setters
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getDescription() {
        return description;
    }

    public String getMoodInDream() {
        return moodInDream;
    }

    public int getIntensity() {
        return intensity;
    }

    @Override
    public String toString() {
        return "DreamLog{" +
                "timestamp=" + timestamp +
                ", description='" + description + '\'' +
                ", moodInDream='" + moodInDream + '\'' +
                ", intensity=" + intensity +
                '}';
    }
}

