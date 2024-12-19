import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
import java.time.LocalDateTime;

public class MoodTrackerApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Mood Tracker");

        // Mood combo box
        ComboBox<String> moodComboBox = new ComboBox<>();
        moodComboBox.getItems().addAll("Happy", "Sad", "Anxious", "Calm");

        // Mood intensity slider
        Slider intensitySlider = new Slider(1, 10, 5);
        intensitySlider.setShowTickMarks(true);
        intensitySlider.setShowTickLabels(true);

        // Button to save mood log
        Button logMoodButton = new Button("Log Mood");
        logMoodButton.setOnAction(e -> {
            String selectedMood = moodComboBox.getValue();
            int intensity = (int) intensitySlider.getValue();
            MoodLog moodLog = new MoodLog(LocalDateTime.now(), selectedMood, intensity);
            MoodLogger.saveMoodLog(moodLog);
            System.out.println("Mood logged: " + moodLog);
        });

        // Layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(moodComboBox, intensitySlider, logMoodButton);
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

