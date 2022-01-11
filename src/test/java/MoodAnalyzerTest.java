import com.blz.day19.MoodAnalysisException;
import com.blz.day19.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    @Test
    public void given_NullMood_Should_Throw_MoodAnalysisException() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.Exception_Type.NULL,e.type);
        }
    }
}