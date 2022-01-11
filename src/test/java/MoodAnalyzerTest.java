import com.blz.day19.MoodAnalysisException;
import com.blz.day19.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_SadMood_Should_Return_Sad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In a Sad Mood");
        String mood;
        try {
            mood = moodAnalyzer.analyseMood();
            Assertions.assertEquals("SAD", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void givenMessage_AnyMood_Should_Return_HAPPY() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Happy Mood");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            Assertions.assertEquals("HAPPY", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
}