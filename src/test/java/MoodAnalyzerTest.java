import com.blz.day19.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_SadMood_Should_Return_Sad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In a Sad Mood");
        String mood = moodAnalyzer.analyseMood();
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals("SAD", mood);


    }
}