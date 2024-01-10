import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class AssumptionTest {

    @Test
    public void testOnWindows() {
        assumeTrue(System.getProperty("os.name").toLowerCase().contains("windows"));
        System.out.println("Test on Windows is running...");
    }

    @Test
    public void testOnLinux() {
        assumeTrue(System.getProperty("os.name").toLowerCase().contains("linux"));
        System.out.println("Test on Linux is running...");
    }

}
