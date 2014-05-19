package project.config

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("test")
class TestProfile {
    public TestProfile() {
        println("started with tehst test profile")
    }
}
