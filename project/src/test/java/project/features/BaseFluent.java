package project.features;

import org.fluentlenium.adapter.FluentTest;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by pivotal on 5/19/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = project.Application.class)
@IntegrationTest
@WebAppConfiguration
abstract public class BaseFluent extends FluentTest {
}
