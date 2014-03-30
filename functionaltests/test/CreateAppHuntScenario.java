import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CreateAppHuntScenario extends FunctionalTestBase{

    @Test
    public void shouldCreateNewAppHunt() throws Exception {
        homepage.visit();
        assertThat(homepage.getCreationButtonText(), is("Create New Apt Hunt"));
    }
}
