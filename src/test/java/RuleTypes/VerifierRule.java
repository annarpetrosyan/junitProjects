package RuleTypes;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Verifier;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertTrue;

public class VerifierRule {

    private List<String> resultList = new ArrayList<>();

    @Rule
    public Verifier verifier = new Verifier() {
        @Override
        protected void verify() throws Throwable {
            assertTrue("Result list should not be empty", !resultList.isEmpty());
        }
    };

    @Test
    public void testWithVerifier() {
//        resultList.add("Element 1");
//        resultList.add("Element 2");

        resultList.add("Element 1");
    }
}
