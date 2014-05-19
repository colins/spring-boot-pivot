package project.config

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
@Profile("development")
class DevelopmentProfile {
    public DevelopmentProfile() {
        println("started with the development profile")
    }
}
