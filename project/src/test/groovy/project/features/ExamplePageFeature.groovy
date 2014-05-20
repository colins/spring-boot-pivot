package project.features

import com.googlecode.flyway.core.Flyway
import org.junit.Before
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import project.support.TestRepository
import project.support.User

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.IdClass
import javax.sql.DataSource

import static org.fest.assertions.Assertions.assertThat

class ExamplePageFeature extends BaseFluent {
    @Autowired
    TestRepository testRepository;

    @Autowired
    Flyway flyway;

//    @Autowired
//    DataSource source;

    @Before
    def void before() {
        flyway.clean();
//        statement = source.connection.createStatement()
//        statement.execute("create table user ( id integer )")
        flyway.migrate();
    }

    @Test
    def void itIsAbleToGoToTheExamplePage() {
        given_IAmOnTheRootPage()
        when_IFollowExampleLink()
        then_ISeeExamplePage()
    }

    @Test
    def void itCleansUpAfterItself() {
        def user = testRepository.findOne(1l);
        assertThat(user).isNull();

        testRepository.save(new User(1l))
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
