import org.junit.Test;import tasks.ConfigObjectProvider;
public class OwnerTest {
    ConfigObjectProvider cfg = new ConfigObjectProvider();

    @Test
    public void ownerGetParticularTest() {

        System.out.println("width:" + cfg.getBrowserWidth() +
                "\nheight:" + cfg.getBrowserHeight() +
                "\nhomepage:" + cfg.getHomepageURL());
    }

    @Test
    public void ownerGetAllTest() {
        ConfigObjectProvider cfg = new ConfigObjectProvider();
        System.out.println(cfg.collectAllToString());
    }
}
