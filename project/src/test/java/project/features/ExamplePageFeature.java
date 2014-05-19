package project.features;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class ExamplePageFeature extends BaseFluent {

    @Test
    public void itIsAbleToGoToTheExamplePage() {
        given_IAmOnTheRootPage();
        when_IFollowExampleLink();
        then_ISeeExamplePage();
    }

    public void given_IAmOnTheRootPage() {
        goTo("http://localhost:9000/");
    }

    public void when_IFollowExampleLink() {
        find("a#example-link").click();
    }

    public void then_ISeeExamplePage() {
        assertThat(findFirst("h2").getText()).contains("inside the template");
    }

}
