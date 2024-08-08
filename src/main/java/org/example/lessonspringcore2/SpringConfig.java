package org.example.lessonspringcore2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.lessonspringcore2")
public class SpringConfig {
    @Bean
    public Engine engine1() {
        return new Engine(1, 200);
    }

    @Bean
    public Engine engine2() {
        return new Engine(2, 300);
    }

    @Bean
    public Auto auto1() {
        return new Auto(1, engine1(), "v8");
    }

    @Bean
    public Auto auto2() {
        return new Auto(2, engine1(), "v9");
    }

    @Bean
    public Auto auto3() {
        return new Auto(3, engine2(), "v10");
    }

}
