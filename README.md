# Mood Tracker

(Still somewhat of a WIP) As a student not only in computer science but also in psychology, I decided to somewhat combine the two in making a simple Java application for tracking moods and dreams. This project allows users to log their moods and dream experiences, saving the information to CSV files for future reference.

## Features

- **Mood Logging**: Track your mood with an intensity rating (scale of 1-10) at any given time.
- **Dream Logging**: Log your dreams with mood, description, and intensity.
- **Persistent Storage**: Logs are saved in CSV files (`mood_logs.csv` and `dream_logs.csv`) for future reference.
- **User Interface**: A simple GUI built with JavaFX to easily log moods and view a dropdown of available moods.

## Classes

### `DreamLog`
This class models a dream log, containing:
- `timestamp`: Date and time of the dream.
- `description`: Description of the dream.
- `moodInDream`: Mood felt during the dream.
- `intensity`: Intensity of the mood during the dream on a scale of 1-10.

### `DreamLogger`
Handles saving `DreamLog` objects to a `dream_logs.csv` file.

### `MoodLog`
This class models a mood log, containing:
- `timestamp`: Date and time of the mood log.
- `mood`: Description of the mood.
- `intensity`: Intensity of the mood on a scale of 1-10.

### `MoodLogger`
Handles saving `MoodLog` objects to a `mood_logs.csv` file.

### `MoodTrackerApp`
The main JavaFX application that provides a GUI to:
- Select a mood.
- Adjust the mood intensity.
- Log the mood to a CSV file.

## Requirements

- Java 8 or higher
- JavaFX library

## How to Run

1. Compile the Java files.
2. Run `MoodTrackerApp.java` to launch the GUI.
3. Select your mood, adjust the intensity, and click "Log Mood" to save your mood to a CSV file.

### Example usage:
```bash
javac *.java
java MoodTrackerApp

