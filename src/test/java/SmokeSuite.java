import org.junit.Test;

public class SmokeSuite {

    @Test
    public void smokeLoginTest() {
        LoginTest lt = new LoginTest();
        lt.negativeTest();
        lt.positiveTest();
    }
}
