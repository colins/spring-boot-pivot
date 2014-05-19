package project.unit;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ExampleTest {
    @Test
    public void fooTest() {
        assertThat(1, is(equalTo(1)));
    }
}
