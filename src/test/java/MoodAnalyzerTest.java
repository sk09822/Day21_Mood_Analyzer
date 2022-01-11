import com.blz.day19.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am In Any Mood");
        Assertions.assertEquals("HAPPY", mood);

    }
    @Test
    public void givenMessage_AnyMood_Should_Return_HAPPY() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
}
