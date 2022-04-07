import org.junit.Test;
import com.janos.training.jenkins.JenkinsCalculator;

import static org.junit.Assert.*;

public class JenkinsCalcTest {

    @Test
    public void addTest() {
        JenkinsCalculator myCalc = new JenkinsCalculator();
        assertEquals(10, myCalc.addNumbers(5, 5));
    }

    @Test
    public void subtractTest() {
        JenkinsCalculator myCalc = new JenkinsCalculator();
        assertEquals(5, myCalc.subtractNumbers(10, 5));
    }
}
