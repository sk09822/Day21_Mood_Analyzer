import com.blz.day19.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void given_SadMood_Should_Return_Sad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyzerMood("I am In a Sad Mood");
        Assertions.assertEquals("SAD", mood);

    }
    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer();
        String mood = moodAnalyser.analyzerMood("I am in Any Mood");
        Assertions.assertEquals("HAPPY", mood);
    }

}