package project.features

import org.junit.Test

import static org.fest.assertions.Assertions.assertThat

class ExamplePageFeature extends BaseFluent {

    @Test
    def void itIsAbleToGoToTheExamplePage() {
        given_IAmOnTheRootPage()
        when_IFollowExampleLink()
        then_ISeeExamplePage()
    }

    def void given_IAmOnTheRootPage() {
        goTo("http://localhost:9000/")
    }

    def void when_IFollowExampleLink() {
        find("a#example-link").click()
    }

    def void then_ISeeExamplePage() {
        assertThat(findFirst("h2").getText()).contains("inside the template");
    }

}
